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
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        <<abstract>>
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
        <<abstract>>
    }

    class iPhone {
    }


