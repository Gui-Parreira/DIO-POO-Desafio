# DIO - Trilha Java Básico

```mermaid
classDiagram
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        <<abstract>>
    }

    class AparelhoTelefonico {  
        +ligar(String exemplo)
        +atender()
        +iniciarCorreioVoz()
        <<abstract>>
    }

    class NavegadorInternet {
        +exibirPagina(String exemplo)
        +adicionarNovaAba()
        +atualizarPagina()
        <<abstract>>
    }

    class iPhone {
    }


