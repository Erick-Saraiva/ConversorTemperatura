package application
    fun main() {

        /* 1 Fase do projeto é fazer funcionar via Console.

           2 Fase do projeto é inserir as conversões realizadasem um banco de dados de início MySql por ser local,
           depois tentar usar o MongoDb para aprender.

           3 Fase é implementar para web, localhost gerando com uma tela feia mesmo só para análise.

           4 Fase seria implementar endpoints para separar as abas por conversão especifica:

           Exemplo: localhost:8080/conversor/celsius (abre o conversor para Celsius)
           Exemplo: localhost:8080/conversor/farenheit (abre o conversor para Farenheit)
           Exemplo: localhost:8080/conversor/kelvin (abre o conversor para Kelvin)

        */

        val datas = Datas()

        println(datas.transformarRealEmDolar(10.0))
        println(datas.transformarRealEmEuro(10.0))

    }
