package application

class Datas {

    private val dolar = 5.41
    private val euro = 5.54

    fun transformarRealEmDolar(quantidadeEmReal: Double): Double {
        return quantidadeEmReal * dolar
    }

    fun transformarRealEmEuro(quantidadeEmReal: Double): Double {
        return quantidadeEmReal * euro
    }

}