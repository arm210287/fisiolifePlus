package fisioBack.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.ListTopicsRequest;
import com.amazonaws.services.sns.model.ListTopicsResult;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;
import com.amazonaws.services.sns.model.Topic;

@Service
public class EnvioSMSCita {

	// AWS credentials -- replace with your credentials
	private final static String ACCESS_KEY = "AKIAIAD5TZG6T6YE63OQ";
	private final static String SECRET_KEY = "evyA6dLfYuH4zRru9+llt+1/m+qocHH+9UN7Nn2v";

	@SuppressWarnings("deprecation")
	@Scheduled(cron = "0 12 19 ? * MON-FRI")
	public void envioSMS() {
		AmazonSNSClient snsClient = new AmazonSNSClient(new AWSCredentials() {

			@Override
			public String getAWSSecretKey() {
				return SECRET_KEY;
			}

			@Override
			public String getAWSAccessKeyId() {
				return ACCESS_KEY;
			}
		});
		Map<String, MessageAttributeValue> smsAttributes = new HashMap<String, MessageAttributeValue>();
		
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
				.withStringValue("FisioLifeVA") // The sender ID shown on the
												// device.
				.withDataType("String"));
		
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue()
				.withStringValue("Promotional") // Sets the type to promotional.
				.withDataType("String"));

		String message = "FisioLife Vista Alegre te recuerda que tu sesion es el dia de mañana a las 17:00h, agradecemos tu confirmación y en el caso"
				+ " de no poder asistir avisar lo antes posibles, disculpe las molestias y un saludo.";
		String phoneNumber = "+34695368704";
		
		// <set SMS attributes>
		sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
		System.out.println("Preparo mensaje :" + message + " "
				+ "al telefono: " + phoneNumber);
	}

	public static void sendSMSMessage(AmazonSNSClient snsClient,
			String message, String phoneNumber,
			Map<String, MessageAttributeValue> smsAttributes) {

		PublishResult result = snsClient.publish(new PublishRequest()
				.withMessage(message).withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		System.out.println(result); // Prints the message ID.
	}
}
