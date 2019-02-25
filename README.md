# i18n in Java 11, Spring Boot, and JavaScript

This example shows how to do i18n in Java 11, Spring Boot, and JavaScript. Please read [i18n in Java 11, Spring Boot, and JavaScript](https://developer.okta.com/blog/2019/02/25/java-i18n-internationalization-localization) to see how this example was created.

**Prerequisites:** [Java 11](https://adoptopenjdk.net/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-java-i18n-example.git
cd okta-java-i18n-example
```

Run the basic example with English.

```shell
java Hello.java
```

Or Spanish:

```shell
java Hello.java es
```

There's also a Spring Boot example, and a `custom-login` example you can read more about in the blog post.

To run the `custom-login` example, you'll need to create an account and OIDC app on Okta.

### Create an Application in Okta

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup-now/) if you don’t have an account).

. From the **Applications** page, choose **Add Application**.
. On the Create New Application page, select **Web**.
. Give your app a memorable name, then click **Done**.

Copy your issuer (found under **API** > **Authorization Servers**), client ID, and client secret into `custom-login/src/main/resources/application.yml` as follows:

[source,yaml]
----
okta:
  oauth2:
    issuer: https://{yourOktaDomain}/oauth2/default
    client-id: {yourClientID}
    client-secret: {yourClientSecret}
----

**NOTE:** The value of `{yourOktaDomain}` should be something like `dev-123456.okta.com`. Make sure you don't include `-admin` in the value!

After modifying this file, start the custom-login app and you should be able to authenticate with Okta.

## Links

This example uses the following open source libraries:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot) 
* [Okta Sign-In Widget](https://developer.okta.com/code/javascript/okta_sign-in_widget)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Security](https://spring.io/projects/spring-security)
* [OpenJDK](https://openjdk.java.net/)

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2019/02/25/java-i18n-internationalization-localization), or on the [Okta Developer Forums](https://devforum.okta.com/).

## License

Apache 2.0, see [LICENSE](LICENSE).
