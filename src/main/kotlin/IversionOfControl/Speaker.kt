package IversionOfControl

class Speaker {

  var writer = SpeachWriter()


    fun Speaker(writer: SpeachWriter){
        this.writer = writer
    }

    fun speak(){
        println(writer?.getSpeach())
    }
}