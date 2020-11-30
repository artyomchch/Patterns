package Adapter

fun main(){
    val celsiusTemperature = CelsiusTemperature(0.0)
    val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

    celsiusTemperature.temperature = 36.6
    println("${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")

   // assertThat(fahrenheitTemperature.temperature).isEqualTo(97.88)

    fahrenheitTemperature.temperature = 100.0
    println("${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")

    //assertThat(celsiusTemperature.temperature).isEqualTo(37.78)
}