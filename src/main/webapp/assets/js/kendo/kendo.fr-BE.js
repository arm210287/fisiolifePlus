/*
* Kendo UI Localization Project for v2012.3.1114 
* Copyright 2012 Telerik AD. All rights reserved.
* 
* French FR (fr-FR) Language Pack
*
* Project home  : https://github.com/loudenvier/kendo-global
* Kendo UI home : http://kendoui.com
* Author        : Felipe Machado (Loudenvier) 
*                 http://feliperochamachado.com.br/index_en.html
*
* This project is released to the public domain, although one must abide to the 
* licensing terms set forth by Telerik to use Kendo UI, as shown bellow.
*
* Telerik's original licensing terms:
* -----------------------------------
* Kendo UI Web commercial licenses may be obtained at
* https://www.kendoui.com/purchase/license-agreement/kendo-ui-web-commercial.aspx
* If you do not own a commercial license, this file shall be governed by the
* GNU General Public License (GPL) version 3.
* For GPL requirements, please review: http://www.gnu.org/copyleft/gpl.html
*/

kendo.ui.Locale = "French FR (fr-BE)";
kendo.ui.ColumnMenu.prototype.options.messages = 
  jQuery.extend(kendo.ui.ColumnMenu.prototype.options.messages, {

/* COLUMN MENU MESSAGES 
 ****************************************************************************/   
  sortAscending: "Trier a-z",
  sortDescending: "Trier z-a",
  filter: "Filtre",
  columns: "Colonnes"
 /***************************************************************************/   
});

kendo.ui.Groupable.prototype.options.messages = 
  jQuery.extend(kendo.ui.Groupable.prototype.options.messages, {

/* GRID GROUP PANEL MESSAGES 
 ****************************************************************************/   
  empty: "Glissez ici l'ent�te d'une colonne pour grouper les donn�es"
 /***************************************************************************/   
});

kendo.ui.FilterMenu.prototype.options.messages = 
  jQuery.extend(kendo.ui.FilterMenu.prototype.options.messages, {
  
/* FILTER MENU MESSAGES 
 ***************************************************************************/   
  info: "Montrer les �l�ments dont la valeur:", // sets the text on top of the filter menu
  isTrue: "est vrai",                   // sets the text for "isTrue" radio button
  isFalse: "n'est pas vrai",                 // sets the text for "isFalse" radio button
  filter: "Filtre",                    // sets the text for the "Filter" button
  clear: "Effacer",                      // sets the text for the "Clear" button
  and: "Et",
  or: "Ou",
  selectValue: "-Choisissez une valeur-"
 /***************************************************************************/   
});
         
kendo.ui.FilterMenu.prototype.options.operators =           
  jQuery.extend(kendo.ui.FilterMenu.prototype.options.operators, {

/* FILTER MENU OPERATORS (for each supported data type) 
 ****************************************************************************/   
  string: {
      eq: "Est �gal �",
      neq: "N'est pas �gal �",
      startswith: "Commence par",
      contains: "Contient",
      doesnotcontain: "Ne contient pas",
      endswith: "Fini par"
  },
  number: {
      eq: "Est �gal �",
      neq: "N'est pas �gal �",
      gte: "Est plus grand ou �gal �",
      gt: "Est plus grand que",
      lte: "Est inf�rieur ou �gal �",
      lt: "Est inf�rieur que"
  },
  date: {
      eq: "Est le ",
      neq: "N'est pas le",
      gte: "Est apr�s ou le",
      gt: "Est apr�s le",
      lte: "Est avant ou le",
      lt: "Est avant le"
  },
  enums: {
      eq: "Est �gal �",
      neq: "N'est pas �gal �",
  }
 /***************************************************************************/   
});

kendo.ui.Pager.prototype.options.messages = 
  jQuery.extend(kendo.ui.Pager.prototype.options.messages, {
  
/* PAGER MESSAGES 
 ****************************************************************************/   
  display: "{0} - {1} de {2} �l�ments",
  empty: "Aucun �l�ment � afficher",
  page: "Page",
  of: "de {0}",
  itemsPerPage: "�l�ments par page",
  first: "Vers la premi�re page",
  previous: "Vers la page pr�c�dente",
  next: "Vers la page suivante",
  last: "Vers la derni�re page",
  refresh: "Rafraichir"
 /***************************************************************************/   
});

kendo.ui.Validator.prototype.options.messages = 
  jQuery.extend(kendo.ui.Validator.prototype.options.messages, {

/* VALIDATOR MESSAGES 
 ****************************************************************************/   
  required: "{0} est obligatoire",
  pattern: "{0} n'est pas valide",
  min: "{0} doit �tre plus grand ou �gal � {1}",
  max: "{0} doit �tre plus petit ou �gal � {1}",
  step: "{0} n'est pas valide",
  email: "{0} n'est pas une adresse mail valide",
  url: "{0} n'est pas un lien (URL) valide",
  date: "{0} n'est pas une date valide"
 /***************************************************************************/   
});

kendo.ui.ImageBrowser.prototype.options.messages = 
  jQuery.extend(kendo.ui.ImageBrowser.prototype.options.messages, {

/* IMAGE BROWSER MESSAGES 
 ****************************************************************************/   
  uploadFile: "Charger",
  orderBy: "Trier par",
  orderByName: "Nom",
  orderBySize: "Taille",
  directoryNotFound: "Aucun r�p�rtoire de ce nom.",
  emptyFolder: "R�pertoire vide",
  deleteFile: 'Etes-vous s�r de vouloir supprimer "{0}"?',
  invalidFileType: "Le fichier s�lectionn� \"{0}\" n'est pas valide. Les type fichiers support�s sont {1}.",
  overwriteFile: "Un fichier du nom \"{0}\" existe d�j� dans ce r�pertoire. Voulez-vous le remplacer?",
  dropFilesHere: "glissez les fichiers ici pour les charger"
 /***************************************************************************/   
});

kendo.ui.Editor.prototype.options.messages = 
  jQuery.extend(kendo.ui.Editor.prototype.options.messages, {

/* EDITOR MESSAGES 
 ****************************************************************************/   
  bold: "Gras",
  italic: "Italique",
  underline: "Sousligner",
  strikethrough: "Barrer",
  superscript: "Superscript",
  subscript: "Subscript",
  justifyCenter: "Centrer text",
  justifyLeft: "Aligner text gauche",
  justifyRight: "Aligner text droite",
  justifyFull: "Alligner gauche et droite",
  insertUnorderedList: "Inserer la liste dans le d�sordre",
  insertOrderedList: "Inserer la liste dans l'ordre",
  indent: "Indenter",
  outdent: "D�sindenter",
  createLink: "Inserer hyperlien",
  unlink: "Supprimer hyperlien",
  insertImage: "Inserer image",
  insertHtml: "Inserer HTML",
  fontName: "S�lectionner police",
  fontNameInherit: "(h�riter police)",
  fontSize: "Selectionner taille police",
  fontSizeInherit: "(h�riter taille)",
  formatBlock: "Format",
  foreColor: "Couleur",
  backColor: "Couleur de fond",
  style: "Styles",
  emptyFolder: "R�pertoire vide",
  uploadFile: "Charger",
  orderBy: "Trier par:",
  orderBySize: "Taille",
  orderByName: "Nom",
  invalidFileType: "Le fichier s�lectionn� \"{0}\" n'est pas valide. Les types de fichiers support�s sont {1}.",
  deleteFile: 'Etes-vous s�r de vouloir supprimer le fichier "{0}"?',
  overwriteFile: 'Un fichier du nom "{0}" existe d�j� dans ce r�pertoire. Voulez-vous le remplacer?',
  directoryNotFound: "Aucun r�pertoire de ce nom.",
  imageWebAddress: "Adress web",
  imageAltText: "Texte alternatif",
  dialogInsert: "Ins�rer",
  dialogButtonSeparator: "ou",
  dialogCancel: "Abandonner"
 /***************************************************************************/   
});
