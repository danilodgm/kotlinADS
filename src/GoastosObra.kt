class GoastosObra {

    var insumos = somaInsumos()
    var contratacoes = contrataMaoDeObra()
    var equipamentos = aluguelEquipamentos()


    fun somaInsumos() :ArrayList<Insumos>{

        var cimento = Insumos()
            .nome("Cimento")
            .custo(20.0)
            .quantidade(5)

        var cal = Insumos()
            .nome("Cal")
            .custo(10.0)
            .quantidade(2)

        var tijolo = Insumos()
            .nome("Tijolo")
            .custo(500.0)
            .quantidade(2)



        var list = ArrayList<Insumos>()
        list.add(cimento)
        list.add(cal)
        list.add(tijolo)

       return list
    }

    fun contrataMaoDeObra() :ArrayList<MaoDeObra>{

        var funcionario1 = MaoDeObra()
            .comNome("Jose")
            .valorHora(60.0)

        var funcionario2 = MaoDeObra()
            .comNome("João")
            .valorHora(30.0)

        var funcionario3 = MaoDeObra()
            .comNome("Sergio")
            .valorHora(160.0)


        var funcionario4 = MaoDeObra()
            .comNome("Pedro")
            .valorHora(50.0)

        var list = ArrayList<MaoDeObra>()

        list.add(funcionario1)
        list.add(funcionario2)
        list.add(funcionario3)
        list.add(funcionario4)

        return list
    }

    fun aluguelEquipamentos() :ArrayList<Equipamento>{

        var trator = Equipamento()
            .comNome("Trator")
            .cobraPorHora(20.0)
            .horaTrabalhada(10)

        var andaime = Equipamento()
            .comNome("Andaime")
            .cobraPorHora(10.0)
            .horaTrabalhada(10)

        var betoneira = Equipamento()
            .comNome("Betoneira")
            .cobraPorHora(20.0)
            .horaTrabalhada(30)

        var list = ArrayList<Equipamento>()
        list.add(trator)
        list.add(andaime)
        list.add(betoneira)

        return list

    }



}