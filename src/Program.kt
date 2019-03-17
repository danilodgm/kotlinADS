
var gastos = GoastosObra()

fun main(args: Array<String>) {

    var contrucao1 = Obra()
        .cliente("Unifeob")
        .diasTrabalhado(45)
        .contratarMaoDeObra(gastos.contratacoes)
        .comEqipamentosUtilizados(gastos.equipamentos)
        .comprarInsumos(gastos.insumos)
        .totalInsumos()
        .gastosComMaoDeObra()
        .gastoComEqupamentos()
        .totalGasto()


}