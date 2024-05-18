# DIO - Trilha Java Básico

classDiagram

    class ReprodutorMusical {
    +tocar()
	+pausar()
        +selecionarMusica(String exemplo)
    }

    class AparelhoTelefonico {  
    +ligar(String exemplo)
	+atender()
	+iniciarCorreioVoz()
    }

    class NavegadorInternet {
    +exibirPagina(String exemplo)
	+adicionarNovaAba()
	+atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


