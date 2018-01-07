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
import com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.GetSMSAttributesRequest;
import com.amazonaws.services.sns.model.ListTopicsRequest;
import com.amazonaws.services.sns.model.ListTopicsResult;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.SetSMSAttributesRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;
import com.amazonaws.services.sns.model.Topic;

@Service
public class EnvioSMSCita {

	// AWS credentials -- replace with your credentials
	private final static String ACCESS_KEY = "AKIAINDACC6BGGPAPWAA";
	private final static String SECRET_KEY = "jzqpQSmDDI1vgosIio25ZIPVrgNxPv7vSMpnWAhb";

	@SuppressWarnings("deprecation")
/*Expresión CRON	Descripción
15 * * * * ?	Se ejecuta cada 15 segundos
15 0 0 * * ?	Se ejecuta a las 00:00:15
0 15 * * * ?	Se ejecuta cada 15 minutos
0 0 15 * * ?	Se ejecuta cada día a las 15:00:00
0 15 15 ? * *	Se ejecuta cada día a las 15:15:00
0 15 15 * * ?	Se ejecuta cada día a las 15:15:00
0 15 15 * * ? *	Se ejecuta cada día a las 15:15:00
0 15 15 * * ? 2010	Se ejecuta cada día a las 15:15:00 durante el 2010
0 0/15 15 * * ?	Se ejecuta cada 15 minutos a partir de las 15:00:00
0 10/15 15 * * ?	Se ejecuta cada 15 minutos a partir de las 15:10:00
0 0/15 15,17 * * ?	Se ejecuta cada 15 minutos a partir de las 15:00:00 hasta las 17:45:00
0 0-15 15 * * ?	Se ejecuta cada 15 minutos empezando a las 15:00:00 y terminando a las 15:15:00
0 15,25 15 * * ?	Se ejecuta a las 15:15:00 y a las 15:25:00
0 15 15 2 * ?	Se ejecuta a las 15:15:00 del día 2 de cada mes
0 15 15 2 4 ?	Se ejecuta a las 15:15:00 del día 2 del mes de abril
0 15 15 ? 4 FRI	Se ejecuta a las 15:15:00 de cada viernes del mes de abril
0 15 15 ? * MON-FRI	Se ejecuta a las 15:15:00 de lunes a viernes
0 15 15 L * ?	Se ejecuta a las 15:15:00 del último día de cada mes
0 15 15 ? * 6L	Se ejecuta a las 15:15:00 del último viernes del mes
0 15 15 ? * 6L 2010	Se ejecuta a las 15:15:00 del último viernes del mes durante el 2010
0 15 15 ? * 6L 2008-2010	Se ejecuta a las 15:15:00 del último viernes del mes entre el 2008 y el 2010
0 15 15 ? * 6#2	Se ejecuta a las 15:15:00 el segundo viernes de cada mes
0 15 15 1/5 * ?	Se ejecuta a las 15:15:00 cada 5 dias a partir del primer dia del mes
*/
	@Scheduled(cron = "0 0 15 * * ?")
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
		
		
		Map<String, MessageAttributeValue> smsAttributes =
		        new HashMap<String, MessageAttributeValue>();
//		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
//		        .withStringValue("Fisiolife") //The sender ID shown on the device.
//		        .withDataType("String"));
//		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue()
//		        .withStringValue("Promotional") //Sets the type to promotional.
//		        .withDataType("String"));
//
		String message = "FisioLife Vista Alegre te recuerda que tu sesion es el dia de mañana a las 17:00h";

		// telefono
		String phoneNumber = "+34695368704";
		//check si esta disponible el telefono
//		CheckIfPhoneNumberIsOptedOutRequest request = new CheckIfPhoneNumberIsOptedOutRequest().withPhoneNumber(phoneNumber);
//		System.out.println(snsClient.checkIfPhoneNumberIsOptedOut(request));

		// <set SMS attributes>
		sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
		System.out.println("mensaje enviado :" + message + " "
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
