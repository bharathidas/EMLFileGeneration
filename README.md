# EML File Generation

This module helps to generate EML file using

###### • Microsoft Graph API 
###### • Custom Java Action

## Generate EML using Graph API:

Check the https://learn.microsoft.com/en-us/graph/outlook-get-mime-message

Permission to get mime message:

https://learn.microsoft.com/en-us/graph/permissions-reference#mail-permissions

Add the Configuration page ‘EmailConfiguration_NewEdit’ to Navigation to configure the Tenant ID, Client Id, and Client Secret.

Add the ‘EmailToTestGraphAPI’ to generate the EML file by passing the Email Message ID and Email. The ‘Get EML file’ button will generate the EML file, and the file will be downloaded.

## Generate EML using Java Action:

JA_GenerateEMLFile java action is used to generate the EML file 

Add the ‘Email_Overview’ page in Navigation and enter the From,To,CC,BCC,Subject,HTMLBody,DateSent,EMLFileName and the attachments if any and Save it.
Click on the ‘Generate EML File’ button in ‘Email_Overview’ page to generate the 

## Dependencies
• Mendix modeler 9.12.4

• Jars are added as part of the module

•	Encryption module

•	Community Commons Module

## Screenshots
![Screenshot_1](https://user-images.githubusercontent.com/23263603/202671212-4042d5ae-1c1a-4429-9475-8af088624f0a.png)
