class Equipamento {

    var nome = ""
    var valorHora = 0.0
    var qtdeHora = 0

    fun comNome(nome: String) :Equipamento{
        this.nome = nome
        return this
    }


    fun cobraPorHora(valor: Double) :Equipamento{
        this.valorHora = valor
        return this
    }

    fun horaTrabalhada(qtdeHora: Int) :Equipamento{
        this.qtdeHora = qtdeHora
        return this
    }
}