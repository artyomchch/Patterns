package ChainOfResponsibility

interface HeadersChain {
    fun addHeader(inputHeader: String): String
}