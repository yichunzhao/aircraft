# @ConfigurationProperties

## Binding Properties to POJO

Spring annotation @Validated triggers bean validation when beans are initialized.
Using @ConfigurationProperties may binding a group of properties in an object, meanwhile making them validated.

![image](https://user-images.githubusercontent.com/17804600/88745882-6118f780-d14b-11ea-9819-191a25118ddc.png)

@Validated implements a proxy pattern that wraps the proxied data model. However, it introduces proxy data on the front end. It may need a DTO to present a clean data model.

## Spring-boot-configuration-processor

Adding the dependency above, rebuilding the project. It generates a json file that list beans annotated with @ConfigurationProperties. 
This json file is used by the IDE to provide auto-completion and documentation for the properties when editing application.properties and application.yaml files.

![image](https://user-images.githubusercontent.com/17804600/88746526-0ed8d600-d14d-11ea-81e6-c77b576ecd8a.png)


