# @ConfigurationProperties

## Binding Properties to POJO

Spring annotation @Validated triggers bean validation. It informs the Spring to put the bean in the validator.

Using @ConfigurationProperties may binding a group of properties in an object, meanwhile making them validated.

![image](https://user-images.githubusercontent.com/17804600/88745882-6118f780-d14b-11ea-9819-191a25118ddc.png)

@Validated implements a proxy pattern that wraps the proxied data model. However, it introduces proxy behaviours. It may be not a good practice to @Validated data model.

@Validated can be applied on the class level and combined with contrain annotations(@min,@max etc) on the method arguments(primitieve type), or @valid with a complex data type.


## Spring-boot-configuration-processor

Adding the dependency above, rebuilding the project. It generates a json file that list beans annotated with @ConfigurationProperties. 
This json file is used by the IDE to provide auto-completion and documentation for the properties when editing application.properties and application.yaml files.

![image](https://user-images.githubusercontent.com/17804600/88746526-0ed8d600-d14d-11ea-81e6-c77b576ecd8a.png)


