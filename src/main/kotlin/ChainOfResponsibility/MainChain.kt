package ChainOfResponsibility

fun main (){
    val authenticationHeader = AuthenticationHeader("123456")
    val contentTypeHeader = ContentTypeHeader("json")
    val messageBody = BodyPayload("Body:\n{\n\"username\"=\"dbacinski\"\n}")

//construct chain
    authenticationHeader.next = contentTypeHeader
    contentTypeHeader.next = messageBody

//execute chain
    val messageWithAuthentication =
            authenticationHeader.addHeader("Headers with Authentication:\n")
    println(messageWithAuthentication)

    val messageWithoutAuth =
            contentTypeHeader.addHeader("Headers:\n")
    println(messageWithoutAuth)


}