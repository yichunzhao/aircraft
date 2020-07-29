# @ConfigurationProperties

## Binding Properties to POJO

Spring annotation @Validated triggers bean validation as the phase when beans are initialized.
Using @ConfigurationProperties may binding a group of properties in an object, meanwhile making them validated.

![image](https://user-images.githubusercontent.com/17804600/88745882-6118f780-d14b-11ea-9819-191a25118ddc.png)

## Spring-boot-configuration-processor

Adding the dependency above, rebuilding the project. It generates a json file that descripes the binding beans. 

![image](https://user-images.githubusercontent.com/17804600/88746526-0ed8d600-d14d-11ea-81e6-c77b576ecd8a.png)


