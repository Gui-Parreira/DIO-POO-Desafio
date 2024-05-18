# DIO - Trilha Java Básico

```mermaid
classDiagram
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
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


