package uff.ic.lleme.tcc00328.provas.p2.q1.view;

import java.util.List;
import uff.ic.lleme.tcc00328.provas.p2.q1.controller.Dicionario;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Palavra;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Sinonimos;

public abstract class Main {

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        {
            // Entrada de dados pela interface de usuário (View)
            String grafia = "livro";
            String fonetica = "li·vru";
            String significado1
                    = "coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são "
                    + "unidos por meio de cola, costura etc., formando um volume que se recobre com capa resistente.";
            String significado2
                    = "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de "
                    + "documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].";

            // Acionamento da função de incluir palavra do Controler
            dicionario.addSubstantivo(grafia, fonetica, significado1);
            dicionario.addSubstantivo(grafia, fonetica, significado2);
        }

        {
            // Entrada de dados pela interface de usuário (View)
            String grafia = "obra";
            String fonetica = "oo·bruh";
            String significado1 = "aquilo que resulta de um trabalho, de uma ação.";
            String significado2
                    = "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de "
                    + "documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].";

            // Acionamento da função de incluir palavra do Controler
            dicionario.addSubstantivo(grafia, fonetica, significado1);
            dicionario.addSubstantivo(grafia, fonetica, significado2);

        }

        {
            // Acionamento da função listar palavras do Controler
            List<Palavra> palavras = dicionario.listPalavras();

            // Exibição dos dados na interface de usuário
            for (Palavra p : palavras)
                for (Sinonimos s : p.sinonimos)
                    System.out.println(p.grafia + ": " + s.significado);
        }

    }
}
