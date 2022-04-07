package guionplantilla;

import java.util.Scanner;
import java.util.Random;

public class Guionplantilla {

        public static void main(String[] args) {
            
            Random random = new Random();
            Scanner teclado = new Scanner(System.in);

            //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO

            //DEFINIR LAS VARIABLES Y CONSTANTES NECESARIAS AQUI ARRIBA 

                //PRIMERO LAS CONSTANTES


                //AVATARES DISPONIBLES Y OTROS VALORES

            String avatar, hermandad, instituto, minutemen, estatus, d_hermandad, d_instituto, d_minutemen, d_dialogo, p_10mm, p_laser, p_22,saqueador,escena;
            
            estatus = "yermense"; //este valor nunca se usará, pero si no inicializo la variable aquí, netbeans asume que es un error
            d_hermandad = " de la Hermandad del Acero. Eres un tipo duro en armadura de ojalata, eh?";
            d_instituto = " del Instituto. He oido cosas turbias sobre vosotros, pero tú no pareces mal tipo";
            d_minutemen = " de los Minutemen. Un miembro de la vieja guardia. Si aún existís, queda esperanza.";
            d_dialogo =""; //este valor tampoco
            avatar = ""; //ni este
            instituto = "                                          \n" +
                "                      @@@@@@%                     \n" +
                "              @@@@@@@@@@@@@@@@@@@@@@@             \n" +
                "           @@@@@@                 @@@@@@          \n" +
                "                                                  \n" +
                "      @@    @          /@@@          %@    @@     \n" +
                "     @@@       @@@&    @@@@     @@@@       @@@    \n" +
                "    @@&            @@@@@   @@@@@             @@   \n" +
                "     @@@@@@@@@@@@@@@ @@@@@@@@@ @@@@@@@@@@@@@@@    \n" +
                "  ,@@@                @@@@@@@                @@@. \n" +
                "  @@@                 @@@@@@@                @@@@ \n" +
                "  @@@                 @@@@@@&                (@@@ \n" +
                "  @@@%                @@@@@@@                @@@  \n" +
                "   @@@                @@@@@@@%               @@@  \n" +
                "   .@@@             @ @@@@@@#%@             @@@   \n" +
                "    ,@@@           @@#&@@@@@ @@@          .@@@    \n" +
                "      @@@@        @@   @@@@@  @@@        @@@@     \n" +
                "        @@@     %@(    @@@@@    @@      @@@       \n" +
                "          @@&  @@      @@@@       @@ %@@          \n" +
                "              @        (@@@        #@             \n" +
                "                     @@@@@@@@&                    ";

            hermandad = "                                          \n" +
                "                         @&                       \n" +
                "                 .@*    %@@    ,@,                \n" +
                "              &         %@@  ...    &             \n" +
                "            *          &%@@ &@@@/  &@ .,          \n" +
                "        *.&            .%@@*@@@@@@@@@   % #       \n" +
                "      *@ (             @%@@      .@@@@   * @(     \n" +
                "     @@@@    @@@@  .@@@@%@@        @@@@@@ @#@@    \n" +
                "    @@@ (  @@    @@   @@%@@       (@@@    , @@@   \n" +
                "    @@@ # #@@    @@#,@@@%@@*/   &@@@@@@@  * @@@   \n" +
                "    @@@@%  &%#@@(&(     %@@*@@@@@@@       &@@@@   \n" +
                "  @ @@@@(@      . @@@@@.%@@**   @@@      &,@@@@ @ \n" +
                "  @@@@@@@@%      @@    @%@@             @%@@@@@@@ \n" +
                "   &@@@@@@@,&    @@.  &@%@@           & @@@@@@@@  \n" +
                "  @@ @@@@@@@@@ & *  @( /%@@        & @@@@@@@@@ @@ \n" +
                "   #@@@@@@@@@@@@@& %@,  %@@  ,@% %@@@@@@@@@@@@@&  \n" +
                "       @@@@@@@@@@@@@@@@@%@@*@@@@@@@@@@@@@@@@.     \n" +
                "      *@@@@@@@@@@@@@@@@@%@@*@@@@@@@@@@@@@@@@(     \n" +
                "           @@@@@@@@@@,@.%@@ @ @@@@@@@@@@.         \n" +
                "          ,@@@@@@@@@@@%@ @/@@@@@@@@@@@@@/         \n" +
                "              /@@@@@@@@@ @/@@@@@@@@@(             \n" +
                "                     ,#@ @/@#,                    \n" +
                "                        *@&                       \n" +
                "                         @*                   ";

            minutemen = "                                          \n" +
                "         %             ☆☆☆☆           @.        \n" +
                "           @            ☆ ☆          @@           \n" +
                "             @*                    @              \n" +
                "               @@               @ %               \n" +
                "                @@@          @@ &                 \n" +
                "                  @@@@    @@                      \n" +
                "      ☆ ☆          @@@@ &@@@              ☆      \n" +
                "        ☆          *@@@%@@@@@           ☆☆☆      \n" +
                "                 @@@@  @@@  @@@@.                 \n" +
                "                 @@@@    @     @@@                \n" +
                "                @@@@             @@@              \n" +
                "              @@@                  @@             \n" +
                "           @@@@@                      @           \n" +
                "         @@@@@          ☆☆☆            @         \n" +
                "          @@@           ☆☆                     ";
            
            
            
            
            p_10mm ="           ..(##...........................         ....%                       \n" +
                    "          .#%&&%%%%%%%%%%%&&%&&%%%%&&&&%&&&&%%%%%%%%%%%%%%%%%%%                 \n" +
                    "          &/%%%%%%%(#%%%%%%%%%%%%%%######(#&#%%%&##/%%&&%%%%,&%,                \n" +
                    "          &(#%%%%%%#(%%%%%%%%%%%%%%%%%%%%%%&&&&%&(#(((//(*/(//**/               \n" +
                    "         .&#&&&&&&%#&&&&%%%%&&&&&&%%%%%%&@@&@@@@&&&&@&@@@@@&&&&%/&#             \n" +
                    "         #&&&&&&@&@&&%&&&&&&&&&&%&%%&&&&&%&&&&&&%&&&%((&&&&,#####.(&%           \n" +
                    "         &&&&%%%%&&%%%%&&%&%%&%&&@%&%%%&&%&%%%&&#%%%%%%(&&%#%%%%%%&&*           \n" +
                    "         #%&&&&&%%%&&&&&&&&&&&&&&&&&&%%%&%%%%@&&&&&&&%%%%%%%%%%%#               \n" +
                    "               @&%%%&&&&&%#####%&&&&&%%#*      &&&&&&%%%%%%%%%##/               \n" +
                    "                            .*#@@&&%%%(*       % *&&&%%%%%%%%%%#(#              \n" +
                    "                                            #.    #@&&&%%%&#%%%%%#(*            \n" +
                    "                                                     &&&%%%%#%%%%#%##           \n" +
                    "                                                      .&&%&#%%%%%%#%#(.         \n" +
                    "                                                        &&%%&%%%%%%%%%#/        \n" +
                    "                                                         &&%%%%%&%%%%%%%        \n" +
                    "                                                          &&%%%%%%%&#&%*        \n" +
                    "                                                           ,@&,%%&&#/&/ ";
            
            p_laser="                                                                                \n" +
                    "                                        /.*#                                    \n" +
                    "                                  %&%&&%&%%%#%//*/...                           \n" +
                    "                           # ( /####%##&&%&&&&%%#######%###((##(( ,             \n" +
                    "                       /#(.% ##%#(%(////%@&%%%&&&&&&&&@#&(((#&%(&%&(%%(%%&      \n" +
                    "               / ,(%%&%##&%(#(/#%%%%&.*&&#&&&&&&&&&&&&&&&&&&&&&&&&%#/#          \n" +
                    "           (*&%((#%%%&%%%&&&&&%(,*##@@&&&&&&&&&&%%/@@@%%&&%&&&&&@#              \n" +
                    "        &&&&*&&#&&&&&&@%&&&%#&&%%&%%#&&&&&&&@&@@&&&&&                           \n" +
                    "            /&&%&&&@&@%&&&&&&%&*((*&*&&&&%%&%&&&#                               \n" +
                    "                @@@@@@@@@@@@@@@&&&&&&&&&&@@&&&&                                 \n" +
                    "                    .&&@@@@@@@@@@@@@@@&&&&&&%&%%,                               \n" +
                    "                              &&    &%&&&&&&&%%%&&%                             \n" +
                    "                                &%    %%%&&&%&%##%&&                            \n" +
                    "                                   @.       %%%##%#%#&                          \n" +
                    "                                            %&&%%%%%%#%&                        \n" +
                    "                                            #&&&&&&&&%%%&%                      \n" +
                    "                                             &&&&&&&&&%%&&                      \n" +
                    "                                                .@&@#&&&&.                      ";
            p_22 = "                                                                                \n" +
                    "       ,**,,&&@&@%,...,*///((##,*,*,,,,,,,,,,**,*,,.******,.,.,,,,.,,**///*     \n" +
                    "      /*,,//,***,**//*//(((/*///(/////(////*//*/*/**,**,,********,**/*(**/*     \n" +
                    "       #&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&%%%&&&&&&&&&&&&&&&&     \n" +
                    "         @@&&&&@@&@&@@@@&@@@&&&@&@@@&&&&&&&&&&&@@                               \n" +
                    "            /@@@@@@@@@@@@@@&@ (#%      /%                                       \n" +
                    "             @@@@@&@&@@@&@&%   #        &                                       \n" +
                    "            @@&@@@@@@&@&@#&&@   (       *                                       \n" +
                    "            @@@@@&@@@@&@&@@&&&&&&@@@@                                           \n" +
                    "           &&@&@@@@@@@@@@                                                       \n" +
                    "          &&@@@@@@@@@@@*                                                        \n" +
                    "         &@&&@@@@@@@@@@                                                         \n" +
                    "        &@@@@@@@@@@@@@                                                          \n" +
                    "       &@&&@@@@@@@@@@                                                           \n" +
                    "      ,@&@@@%@@@@@@@&@                                                          \n" +
                    "      @@@@@@@@@@@@@@@@                                                          ";
            
            saqueador = "                                                            \n" +
                        "                            &%#(&&                          \n" +
                        "                           %/,*#%&@                         \n" +
                        "                          &(((&&@&@                         \n" +
                        "                       /#%*%##&@@@(#&@&                     \n" +
                        "                       /,#&#/#,#&@%&&#%                     \n" +
                        "                     ..,.*(/(@@@@@&(#@%&%                   \n" +
                        "                    ..*,,.#((*%#####(&#&(&.                 \n" +
                        "                    ,/%(*(*##%##@@&%#@&@@&&                 \n" +
                        "                   /.*%&##&@@@@@@@%@@&@@@&&                 \n" +
                        "                   ,,#@@%&@@@@@@@@@@@@&@@@&*                \n" +
                        "                  .,/@@  #(%((&&%#&#&&  @@&&                \n" +
                        "                  */#@   #(*#@@@@&@@@@  @@&&                \n" +
                        "                  .(&,  %@#%#&#/#/(*#@&  @&&                \n" +
                        "                  .%   *%@&###%(%###@&,  #&&                \n" +
                        "                  ,(/   #%##%@@(@@@@@@@  **&                \n" +
                        "                 ,/**  /,*(@@@@&@@&&&&&% &@&                \n" +
                        "                 *@(*  ,,,*#&%@ @/*,,%&&/@&                 \n" +
                        "                  (#   ***/%%@@ //***(&&                    \n" +
                        "                  /#   /*/(#@@  #/***(%@                    \n" +
                        "                  ##   @//(%@(   ////(%@                    \n" +
                        "                  #(   #@%%%@    #/%#%@(                    \n" +
                        "                  #(   %&@@@@     %%&@@                     \n" +
                        "                  ((   #%&@@      %%&&@,                    \n" +
                        "                   ,   ((#@@      .##&@@                    \n" +
                        "                      #//@&@       *%#&@                    \n" +
                        "                      ,%&@%@       %%&&&                    \n" +
                        "                       ##&@        %#%%@                    \n" +
                        "                       %##@         @@#&                    \n" +
                        "                       %*&@         &@@&                    \n" +
                        "                      .%%&@         &%@@@                   \n" +
                        "                      %&#&@          #&&&@                  \n" +
                        "                                      @%                    ";
            

                 
                //DESPUES LAS VARIABLES

                //NOMBRE DEL PERSONAJE 
                String nombre = "eeeeeeeeeee";
                String descripcion = "soy un poquito vago";
                //AVATAR ELEGIDO
                int opcion,num_avatar;
                //VARIABLES PARA LAS CARACTERISTICAS BASICAS Y SUS VALORES
                int fuerza,resistencia,carisma,percepcion,agilidad,inteligencia,suerte;
//                fuerza = 10;
//                resistencia = 10;
//                carisma = 10;
//                percepcion = 10;
//                agilidad = 10;
//                inteligencia = 10;
//                suerte = 10;
                int[] car_bas_values = {fuerza = 10,resistencia= 10,carisma= 10,percepcion= 10,agilidad= 10,inteligencia= 10,suerte= 10};
                String[] car_bas = {"Fuerza", "Resistencia","Carisma", "Percepcion" , "Agilidad", "Inteligencia", "Suerte"};
                
                int[] car_bas_values_min = {30,30,40,30,20,40,10};
                int[] car_bas_values_her = {50,40,20,30,20,20,20};
                int[] car_bas_values_ins = {20,20,20,40,30,60,10};
                
                int[] mostrar_car_bas = car_bas_values_min;
                
                //VARIABLES PARA EL ATA DEF PM PV ETC Y SUS VALORES INICIALES
                int ataque,defensa,dialogo,sigilo,sistemas;
//                ataque = 10;
//                defensa = 10;
//                dialogo = 10;
//                sigilo = 10;
//                sistemas = 10;
                String[] habilidades = {"Habilidad en ataque","Habilidad en defensa", "Habilidad en diálogos", "Habilidad en sigilo", "Habilidad en sistemas"};
                int[] habilidades_values = {ataque=10,defensa = 10,dialogo = 10,sigilo = 10,sistemas = 10};
                
                
                
                //OTRAS VARIABLES QUE SURJAN
                boolean nombreCorrecto, puntosMayor100,puntosCorrectos, puntosNegativos, avatarCorrecto, arma;
                int puntos, suma, num_arma;
                puntos = 200;
                suma = 0;
                String error_atributos_m100;
                String error_atributos_negativo;
                String espaciador = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
                int k = 0;
                int opcion_pers = 0;
                int clase = 0;
                int combate_pos = 0;
                
                
                error_atributos_m100 = "Valor incorrecto. Los atributos han de tener 100 como máximo";
                error_atributos_negativo = "Los sentimos, pero no puedes asignar puntos negativos ni más puntos de los que te quedan.\n Inténtalo otra vez";
                puntos = 200;
                nombreCorrecto = false;
                puntosCorrectos = true;
                avatarCorrecto = true;
                puntosNegativos = false;
                puntosMayor100 = false;
                arma = true;
                
                
                //VARIABLES ENEMIGO
                
                String nombre_enem;
                int fuerza_e,resistencia_e,carisma_e,percepcion_e,agilidad_e,inteligencia_e,suerte_e;
//                fuerza_e = 10;
//                resistencia_e = 10;
//                carisma_e = 10;
//                percepcion_e = 10;
//                agilidad_e = 10;
//                inteligencia_e = 10;
//                suerte_e = 10;
                int[] car_bas_enem_values = {fuerza_e= 10,resistencia_e= 10,carisma_e= 10,percepcion_e= 10,agilidad_e= 10,inteligencia_e= 10,suerte_e= 10};
                int ataque_e,defensa_e,dialogo_e,sigilo_e,sistemas_e;
//                ataque_e = 0;
//                defensa_e = 0;
//                dialogo_e = 0;
//                sigilo_e = 0;
//                sistemas_e = 0;
                int[] habilidades_enem_values = {ataque_e= 10,defensa_e= 10,dialogo_e= 10,sigilo_e= 10,sistemas_e= 10};
                int j = 0;
                int dificultad = 0;
                
                int[] car_bas_enem_easy_values ={20,20,10,20,20,20,20};
                int[] car_bas_enem_medium_values ={30,30,20,30,20,40,30};
                int[] car_bas_enem_hard_values ={50,30,10,30,20,30,30};
                String vida_enem = "";
                String vida_jug =  "";
                int num_vida_enem = 25;
                int num_vida_jug = 25;
                String enem_dificultad = "";
                
                //COMBATE
                int[] dmg_10mm = {1,6,3,2,7,6,3,5,4,8,3,3,2};
                int[] dmg_laser = {3,3,3,2,4,5,4,5,4,5,4,3,2};
                int[] dmg_22 = {8,3,3,3,8,3,3,3,3,8,3,3,3};
                int[] dmg_disparo = dmg_10mm;
                
        
                int ataque_rand, defensa_rand,agilidad_rand;
                int opcion_combate = 0;
                int opcion2 = 0;
                boolean combate = false;
                int resucitar = 0;
                int turno = 0;
                int almacen = 0;
                int opcion_ataque;
                int daño;
                
                
            String menu = "                  |            \n"+
                          "       1)ATACAR   |  2)HUIR    \n"+
                          "-------------------------------\n"+
                          "       3)CURACIÓN |  4)DIALOGAR\n"+
                          "                  |            \n";
            String menu_dial =  "                               |                          \n"+
                                "       1)ASUSTAR(FUERZA)       |  2)SUPLICAR (CARISMA)    \n"+
                                "----------------------------------------------------------\n"+
                                "       3)RAZONAR(INTELIGENCIA) |  4)ENAMORAR(CARISMA++)   \n"+
                                "                               |                           \n";
            String menu_ataque = "                              |                \n"+
                                 "       1)CUERPO A CUERPO   |  2)DISPARAR    \n"+
                                 "--------------------------------------------\n"+
                                 "       3)INSULTAR          |                \n"+
                                 "                           |                \n";

                
                
                
                
                
                
 
            System.out.println(         "  ______       _      _      ____ _    _  _______      \n" +
                                        " |  ____/\\   | |    | |    / __\\ | |  | ||__   __|   \n" +
                                        " | |__ /  \\  | |    | |   | |  | | |  | |   | |       \n" +
                                        " |  __/ /\\\\  | |    | |   | |  | | |  | |   | |      \n" +
                                        " | | / ____ \\| |____| |___| |__| | |__| |   | |       \n" +
                                        " |_|/_/    \\_\\______|____  \\ ____/\\____/    |_|    \n" +
                                        "                                                         ");
            
            System.out.println(" _______   _                 ______           _   _            __  \n" +
                               " |__   __| | |              |  ____|         | | | |          / _| \n" +
                               "    | |    | |__      ___   | |__      __ _  | | | |   ___    | |_ \n" +
                               "    | |    | '_ \\   / _ \\ |  __|    / _` | | | | |   / _ \\ |  _|\n" +
                               "    | |    | | | |  | ___/  | |      | (_| | | | | |  | (_) | | |  \n" +
                               "    |_|    |_| |_|  \\___|  |_|      \\__,_| |_| |_|  \\___/  |_|  \n" +
                               "                                                                ");
            System.out.print(" _______   _                 _____                  _     _   _             _              \n" +
                             " |__   __| | |              |_   _|               | |    (_)| |           | |             \n" +
                             "    | |    | |__     ___      | |    _ __    ___  | |_    _ | |_     _   _| |_  ___   \n" +
                             "    | |    | '_ \\  / _ \\     | |   | '_ \\  / __| | __| | | | __| | | || | __|  / _ \\ \n" +
                             "    | |    | | | ||  __/    _| |_  | | | | \\__ \\ | |_  | | | |_  | |_| | | |_ |  __/  \n" +
                             "    |_|    |_| |_|  \\___|  |_____| |_| |_| |___/  \\ __|  |_|\\__|  \\__,_|  \\__| \\___|  \n" +
                             "                                                                                    ");
            
            System.out.println("\n");
            System.out.println("                                                                 @@,..@/                          \n" +
            "                                                    @%     @@*/@@@@........@@@*                     \n" +
            "                                                 @*.@/  @@ .......... .........@.                   \n" +
            "                                                 @.......... ... ................&                  \n" +
            "                                                 @.......@#   #@@@#  @@@...........@                \n" +
            "                                                @.@,..@@             ...@..%@@@@(...@%              \n" +
            "                                                @. @  @@              ..........@@...@/             \n" +
            "                                                @@.                  .@.........@,...@@             \n" +
            "                                                @    @@               ........@......@@             \n" +
            "          #@     @                             @    @@&    @     @@@@/........@.@...,@              \n" +
            "         @       @                            @%         @@          @........@.@.*,@@              \n" +
            "        @#      @                             @        @@            ........&#.%@@@@               \n" +
            "        *&    .#                             ,@         %@           ........@...@@                 \n" +
            "         @......@                            .@  &@              @  .............@@                 \n" +
            "   @@@@@@@@@ .....@                           @@  @@    /@@/      @@.............@@                 \n" +
            " @(           @@....@                         &@      @@@@&@@@@    .............@@                  \n" +
            " &@     .       @....@@/                       @@,     @@@        .........@@                       \n" +
            "  @*     @@@@.  @....@@@&@@@@@                   @@             ........@@@  .                      \n" +
            " @(           .@.....@.@((((((((((#@@@@@@@@@@@@@@@@@@         .......@@@,,(@%                       \n" +
            "  @* ** .       @...@  @(((((((((((((((((((((((((((@...@@.  ..........@,,,,,%@(@@                   \n" +
            "  @        *@@@@....@  @##(((((((((((((((((((((((((@... #@@@.....,@@@. .,,,@@(((((#@                \n" +
            "  @@          .@...@  @######((((((((((((((((((((((@/........... .........@%(((((((((#@.            \n" +
            "    @@@@@@@@@@%..@  .@###############(((((((((((((((@@................(@@(((((((((((((((@@          \n" +
            "        @@@@@@/   @#####################&@((((((((((@......... @@@@@%(((((((((((((((((((((%@        \n" +
            "                   &@@@@@@@@@@@@&.      #@(((((((((@.........@#(((((((((((((((((((((((((((((#@      \n" +
            "                                        @@((((((((@@.........@((((((((((((((((((((((((((((((((&@    \n" +
            "                                        @(((((((((@.........@(((((((((((((((((((((((((((((((((((@   \n" +
            "                                        @((((((((@@........ @(((((((((((((&@((((((((((((((((((((((@ ");
            
            //ESTE SCRIPT SOLO SE EJECUTARÁ UNA VEZ
            //SIRVE PARA OBTENER LA POSICIÓN DE LA AGILIDAD EN EL ARRAY
            
            
            
            
            System.out.println("*Despiertas algo mareado en una camilla*");
            System.out.println("Hola, soy el doctor Mitchell.");
            System.out.println("Te encontré tirado en el yermo hace un par de días.");
            System.out.println("Casi creía que estabas muerto");
            System.out.println("¿Como te encuentras? ¿Puedes decirme tu nombre?");
            System.out.print("\u001B[31mPor favor, introduce un nombre para tu personaje: ");
            //COMPROBAR QUE EL NOMBRE ES CORRECTO
            
            do {
                nombre = teclado.nextLine();
                if (!(nombre.equalsIgnoreCase("")))
                {
                    nombreCorrecto = true;
                }else{
                    System.out.println("Nombre Incorrecto, por favor, inténtalo de nuevo");
                }
            } while(!nombreCorrecto);
            escena = "                                                                                                                              \n" +
                        "                                                                                                                                                      \n" +
                        "                               SAQUEADOR                                                                                                              \n" +
                        "                               ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯                                                                             \n" +
                        "                                                                                                                           #@@@@@@@@                  \n" +
                        "                                                                                                 ==@@@@@@@&                &@&@@@@@@@                 \n" +
                        "                                                                                                       .//@(@@               /#/(#%%(&&               \n" +
                        "                                                                                                         (&(#(#(&/#&&&@&**.   #(#%@&&@.(((#%          \n" +
                        "                                                                                                             (@@% .&&&@@@@@@@@@@@@@@@@@@@@@@@@        \n" +
                        "                 *(.@@@@                                                                                       ,@@,      .%@@@@@@@@@@@@@@@@@@@        \n" +
                        "                *.#,,*,,.                                                                                        @@@@    &@@@#/,&@@@@@@@@@@@@@@       \n" +
                        "                %%((%%**,                                                                                         @@@@@&@@@@@@@@@@@@@@@@@@@@@@@,      \n" +
                        "                #&@@@#&@                                                                                            @@@@@@@@@@*@@@@@@@@@@@@@@@@@      \n" +
                        "            (#%#//%@@#(&,                                                                                              (@@@@%.  @@@@@@@@@@@@@@@@@,    \n" +
                        "          %%&&%#/@%%#&(%               //@.@%#&%%==                                                                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@   \n" +
                        "         %%%&&&%@@%*//##%              ,.*/%.                                                                          &@@@@@@@@@@@@@@@@@@@@@@@@@@@@( \n" +
                        "        %%&&&&@&#/(%*,(&/./*#(**%,,/((##/((#                                                                            &@@@@@@@@@@@@@@@@@@@@@@@@@@@& \n" +
                        "        %%&&&@&/%&%%&&&@@&&@%#((@(##%#,&###                                                                              @@@@@@@#@@@@@@@@@@@@@@@@@@@&@\n" +
                        "       ,%&&&&&&@@@@@@&&&&&&@@@@@&                                                                                         @@@@@@@,    /@@@@@@@@@@@@@@ \n" +
                        "       %&&&&&&&&@@@@.#@@@,                                                                                                &@@@@@@@/  @@@@@@@@@@@@@@   \n" +
                        "       &&&&&&&&%&@&&                                                                                                          @@@@@@@@@@@@@@@@@@@@@   \n" +
                        "       &&&&&&@&&&&@@                                                                                                       /&@@@@@@@@@@@@@@@@@@@@@@   \n" +
                        "       &@&&&@@&%@&&&                                                                                                       .        .@@@@@@@          \n" +
                        "       &@@&&@@&@&@@                                                                                                                                   \n" +
                        "       @&&@@@&&@@&&                                                                                                                                   \n" +
                        "       @@&%@%@@@@@                                                                                                                                    \n" +
                        "    *@&@@&&%%&&@@(                                                                                                                                    \n" +
                        "    #@&&%%%%%@@@@&                                                                                                                                    \n" +
                        "       ../@@@(/(%&                                                                                                                                    \n" +
                        "      .,.,,***/*#(                                                                                                                                    \n" +
                        "                                                                   "+nombre+"                                                                         \n" +
                        "                                                                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯                                        \n" +
                        "                                                                                                                                                      \n" +
                        "                                                                                                                                                        ";
            System.out.println("BIENVENIDO/A");
            System.out.println("La parte que sigue es la customización del personaje");
            System.out.println("Entendemos que esto puede no ser 'entretenido', precisamente ");
            System.out.println("Si no te apetece pasar por ello, hay una opción simplificada.");
            System.out.println("Elige si quieres personalización completa o resumida:");
            System.out.println("1)Completa \n2)Resumida");
            System.out.println("Pulsa 1 o 2 para elegir:");
            
            while(opcion_pers > 2 || opcion_pers < 1)
            {
                opcion_pers = teclado.nextInt();  
            }
            switch(opcion_pers){
                case 1: System.out.println("Has elegido la personalización completa");
                break;
                case 2: System.out.println("Has elegido la personalización resumida");
            }
            
            if(opcion_pers == 2)
            {
                avatarCorrecto = false;
                do {
                    System.out.println("\u001B[31mElige un camino con (1), (2) o (3)");
                    System.out.println("\u001B[31m\n \u001B[31m1. La Hermandad \n \u001B[31m2. El Instituto \n \u001B[31m3. Los Minutemen");
                    num_avatar = teclado.nextInt();
                    if(num_avatar >= 1 && num_avatar <= 3)
                    {
                        avatarCorrecto = true;
                    }
                } while (!avatarCorrecto);
                
                
                    
                    System.out.println(espaciador);
                    switch (num_avatar)
                    {
                        case 1:
                            System.out.println("\u001B[31mHas elegido a la Hermandad del Acero");
                            System.out.println("\u001B[31mAD VICTORIAM!");
                            estatus = "caballero";
                            avatar = hermandad;
                            d_dialogo = d_hermandad;
                            car_bas_values = car_bas_values_her;
                            avatarCorrecto = true;
                            break;
                        case 2:
                            System.out.println("\u001B[36mHas elegido al Instituto");
                            System.out.println("\u001B[36mPor la Humanidad!");
                            estatus = "doctor";
                            avatar = instituto;
                            d_dialogo = d_instituto;
                            car_bas_values = car_bas_values_ins;
                            avatarCorrecto = true;
                            break;
                        case 3:
                            System.out.println("\u001B[33mHas elegido a los Minutemen");
                            System.out.println("\u001B[33mPor la Commonwealth!");
                            estatus = "miliciano";
                            avatar = minutemen;
                            d_dialogo = d_minutemen;
                            car_bas_values = car_bas_values_min;
                            avatarCorrecto = true;
                            break;
                         //COMPROBAR QUE EL AVATAR EL CORRECTO
                        default:
                            System.out.println("Ese número no es válido. Inténtalo de nuevo.");
                            
                            break;
                    }
                    System.out.println("Ahora, observa tus características");
                    for (int i = 0; i < car_bas.length; i++) 
                    {
                        System.out.println(car_bas[i]+" : "+car_bas_values[i]);
                    }
                    
                    
                

            }else{
                if(nombreCorrecto)
                {
                  //SI TODO VA BIEN PEDIR DESCRIPCION (LA DESCRIPCION PUEDE SER VACIA)
                    System.out.println("\u001B[31mA continuación, introduce una breve descripción para tu personaje");
                    descripcion = teclado.nextLine();
                  //SI TODA VA BIEN ELEGIR AVATAR
                    System.out.println(espaciador);
                    System.out.println("Bien, "+nombre+". ¿A qué facción perteneces?");
                    System.out.println("Si no sabes de lo que hablo, te refrescaré la memoria");
                    System.out.println("\u001B[31mPrimero,tenemos a la Hermandad del Acero, protectores de la tecnología ");
                    System.out.println("\u001B[31mDespués, tenemos al Instituto, la fuerza tecnológica más poderosa de la commonwealth");
                    System.out.println("\u001B[31mPor último, a los Minutemen, guardianes del pueblo y de la seguridad de la gente");
                    System.out.println("¿Te suenan de algo?");
                    avatarCorrecto = false;
                    do {

                        System.out.println("\u001B[31mElige un camino con (1), (2) o (3)");
                        System.out.println("\u001B[31m\n \u001B[31m1. La Hermandad \n \u001B[31m2. El Instituto \n \u001B[31m3. Los Minutemen");
                        num_avatar = teclado.nextInt();
                        if(num_avatar >= 1 && num_avatar <= 3)
                        {
                            avatarCorrecto = true;
                        }


                    } while (!avatarCorrecto);

                    System.out.println(espaciador);
                        switch (num_avatar)
                        {
                            case 1:
                                System.out.println("\u001B[31mHas elegido a la Hermandad del Acero");
                                System.out.println("\u001B[31mAD VICTORIAM!");
                                estatus = "caballero";
                                avatar = hermandad;
                                d_dialogo = d_hermandad;
                                avatarCorrecto = true;
                                break;
                            case 2:
                                System.out.println("\u001B[36mHas elegido al Instituto");
                                System.out.println("\u001B[36mPor la Humanidad!");
                                estatus = "doctor";
                                avatar = instituto;
                                d_dialogo = d_instituto;
                                avatarCorrecto = true;
                                break;
                            case 3:
                                System.out.println("\u001B[33mHas elegido a los Minutemen");
                                System.out.println("\u001B[33mPor la Commonwealth!");
                                estatus = "miliciano";
                                avatar = minutemen;
                                d_dialogo = d_minutemen;
                                avatarCorrecto = true;
                                break;
                             //COMPROBAR QUE EL AVATAR EL CORRECTO
                            default:
                                System.out.println("Ese número no es válido. Inténtalo de nuevo.");

                                break;
                        }



                                System.out.println("Yo te veo bien, pero necesito saber cómo andan tus características básicas");
                                System.out.println("\u001B[31mAhora, asigna puntos a tus atributos S.P.E.C.I.A.L.");
                                System.out.println("\u001B[31mContarás con"+ "\u001B[35m"+ puntos +" \u001B[31m puntos a repartir entre ellas, y no pueden sobrepasar los 100 en ninguna.");
                                System.out.println("\u001B[31mNo podrás sumar puntos negativos");

                                System.out.println("\u001B[31mLos atributos son:\n Fuerza \n Percepción \n Resistencia \n Carisma \n Inteligencia \n Agilidad \n Suerte");
                                System.out.println("\u001B[31mYa cuentas con 10 puntos base en cada uno");


                                k = 0;
                                while (k < car_bas.length && puntos > 0)  
                                {
                                    System.out.println("\u001B[31m¿Cuantos puntos asignarás a  \u001B[32m"+car_bas[k]+"\u001B[31m ?");
                                    System.out.println("Si pones puntos negativos o te pasas de los 100 en una\n característica, no será valido");
                                    puntosMayor100 = true;
                                    puntosNegativos = true;

                                    while(puntosMayor100 || puntosNegativos)
                                    {
                                        suma = teclado.nextInt();
                                        if(car_bas_values[k]+ suma > 100)
                                        {
                                            System.out.println("Te has pasado de cien");
                                            puntosMayor100 = true;
                                        }else if(suma  < 0 || suma > puntos)
                                        {
                                            System.out.println("Has puesto puntos inválidos");
                                            puntosNegativos = true;
                                        }else{
                                            puntosNegativos = false;
                                            puntosMayor100 = false;
                                        }

                                    }
                                    car_bas_values[k] += suma;
                                    puntos -= suma; 
                                    System.out.println("\u001B[31mAhora, tu nivel de "+car_bas[k]+" es de "+car_bas_values[k]);
                                    System.out.println("\u001B[31mY te quedan: "+ "\u001B[35m"+puntos+"\u001B[31m puntos");
                                    k++;

                                    }

                                }  
                                if(puntos == 0)
                                {
                                    System.out.println(espaciador);
                                    System.out.println("Vaya, parece que te has quedado sin puntos...");
                                } 
                        }   

                                //SI TODO LOS DEMAS BIEN
                                //CALCULAR ATA,DEF,PV,PM
                                //USAR TRAMOS PARA VER LA APORTACION DE CADA VALOR AL TOTAL


                                System.out.println("\u001B[31mAhora, calcularemos tu habilidad en ataque y defensa,");
                                System.out.println("\u001B[31mtu habilidad en diálogos, tu habilidad en sigilo ");
                                System.out.println("\u001B[31my tu habilidad en sistemas");

                                //HABILIDADES
                                for (int i = 0; i < habilidades.length; i++) 
                                {   
                                    if( i == 0 || i == 1)
                                    {
                                        //EL ATAQUE Y LA DEFENSA NO CAMBIARÁN DE POSICIÓN EN EL ARRAY, POR LO QUE LOS LLAMO POR SU POSICIÓN
                                        habilidades_values[i] = (int) ((int) (car_bas_values[0] * 0.4) + (car_bas_values[1] * 0.6));
                                  
                                    }else
                                    {
                                        habilidades_values[i] = (int) ((int) (car_bas_values[i] * 0.4) + (car_bas_values[i+1] * 0.6));
                                    }
                                  
                                         
                                }
                             
                                
                                teclado.nextLine();
                                System.out.println("Entonces, "+estatus+", echemos un vistazo a tus habilidades.");
                                for (int i = 0; i < habilidades.length; i++) 
                                {
                                    System.out.println("Tu "+habilidades[i]+" es de "+habilidades_values[i]);
                                    if(habilidades_values[i] > 60)
                                    {
                                        System.out.println("Vaya, tu "+habilidades[i]+" es impresionante!");
                                    }
                                    
                                }
                                System.out.println("\u001B[31m Pulsa ENTER para continuar");
                                
                                teclado.nextLine();
                                System.out.println(espaciador);
                                System.out.println("======================================================");
                                System.out.println("Vale, todo parece estar en orden, pero antes de irte, veamos cómo has quedado en general");
                                System.out.println("======================================================");
                                System.out.println("Te llamas "+nombre+". Conocí una vez a alguien con ese nombre. Era una gran persona");
                                System.out.println("Y según me has dicho, "+descripcion+", ¿Verdad?");
                                System.out.println("=====================================================");
                                System.out.println("Puede que no recuerdes por qué, pero eres un"+estatus);
                                System.out.println(d_dialogo);
                                System.out.println(avatar);
                                System.out.println("=====================================================");
                                System.out.println("Tienes unos atributos S.P.E.C.I.A.L muy interesantes:");
                                System.out.println("=====================================================");
                                
                                for (int i = 0; i < car_bas.length; i++) 
                                {
                                  System.out.println(car_bas[i]+" : "+car_bas_values[i]);  
                                }
                                System.out.println("\u001B[31m Pulsa ENTER para continuar");
                                
                                teclado.nextLine();
                                System.out.println(espaciador);
                                System.out.println("====================================================");
                                System.out.println("======Y eso te otorga unas habilidades únicas:======");
                                System.out.println("====================================================");
                                
                                for (int i = 0; i < habilidades.length; i++) 
                                {
                                    System.out.println(habilidades[i]+" : "+habilidades_values[i]);   
                                }
                                System.out.println("\u001B[31m Pulsa ENTER para continuar");
                                
                                teclado.nextLine();
                                System.out.println(espaciador);
                                System.out.println("===================================================");
                                System.out.println("Ahora, una gran aventura te aguarda, "+estatus+".");
                                System.out.println("Ha sido un placer conocerte, y algo me dice que nos volveremos a encontrar.");
                                System.out.println("Espera un momento. Sé que eres un "+estatus+" y todo eso, pero debes tener cuidado; el mundo ahí fuera sigue siendo muy peligroso");
                                System.out.println("No tengo mucho,pero deberías llevarte un arma antes de irte");
                                System.out.println("Mira lo que hay:");
                                System.out.println("(1)Pistola de 10mm");
                                System.out.println(p_10mm);
                                System.out.println("\n\n\n (2) Pistola laser");
                                System.out.println(p_laser);
                                System.out.println("\n\n\n (3) Pistola silenciada de calibre 22");
                                System.out.println(p_22);
                                System.out.print("\n\n\n \u001B[31mAhora, elige un arma de las que te han mostrado introduciendo su número: ");
                                
                                
                                arma = false;
                                while(!arma)
                                {
                                    num_arma = teclado.nextInt();
                                   switch (num_arma)
                                    {
                                        case 1:
                                            System.out.println("Has elegido la confiable pistola de 10mm. Dura, de fácil mantenimiento pero potente");
                                            System.out.println(p_10mm);
                                            arma = true;
                                            break;
                                        case 2:
                                            System.out.println("Has elegido la pistola laser. Si te gusta el olor a ozono, la vas a disfrutar");
                                            System.out.println(p_laser);
                                            arma = true;
                                            break;
                                        case 3:
                                            System.out.println("Has elegido la pistola de calibre 22. Está silenciada. No te preguntaré para que quieres eso");
                                            System.out.println(p_22);
                                            arma = true;
                                            break;
                                        default:
                                            System.out.println("Has elegido un número incorrecto");
                                            break;
                                            
                                    } 
                                }
                                System.out.println("Pulsa ENTER para continuar");
                                teclado.nextLine();
                                System.out.println("Ahora sí, estás listo para salir a explorar el yermo. Mucha suerte, amigo mío");
                                System.out.println("Pulsa ENTER para continuar");
                                teclado.nextLine();
                                    
            System.out.println(espaciador);
            System.out.println("\u001B[31mMientras caminas por el yermo, te encuentras con una figura que se acerca a tí...");
            System.out.println(saqueador);
            System.out.println("Tu, yermense. Que guapa la pipa esa que me llevas. Dámela, mierda. Ahora");
            puntos = 200;
            System.out.println("\u001B[31m En el yermo, te encontrarás con muchos individuos indeseables. Este es tu primer enemigo, así que se te permitirá\n "
                             + "personalizarlo para practicar. Tienes "+"\u001B[35m"+ puntos);
            System.out.println("Si lo deseas, puedes omitir esta configuración también:");
            System.out.println("1)Omitir (elige dificultad)\n2)Personalizar");
            opcion_pers = 0;
            while(opcion_pers < 1 || opcion_pers > 2)
            {
                opcion_pers = teclado.nextInt();
            }
            if(opcion_pers == 1)
            {
                System.out.println("Ahora elige la dificultad:");
                System.out.println("1)Fácil\n2)Medio\n3)Dificil");
                while(dificultad < 1 || dificultad > 3)
                {
                    dificultad = teclado.nextInt();
                }
                
                switch(dificultad)
                {
                    case 1: car_bas_enem_values = car_bas_enem_easy_values;
                            enem_dificultad = "DÉBIL";
                    break;
                    case 2: car_bas_enem_values = car_bas_enem_medium_values;
                            enem_dificultad = "MEDIO";
                    break;
                    case 3: car_bas_enem_values = car_bas_enem_hard_values;
                            enem_dificultad = "DURO";
                    break;    
                }
 
            }else{
                enem_dificultad = "RARO";
                
                suma = 0;
                k = 0;
                while (k < car_bas.length && puntos > 0)  
                {
                    System.out.println("\u001B[31m¿Cuantos puntos asignarás a  \u001B[32m"+car_bas[k]+"\u001B[31m ?");
                    System.out.println("Si pones puntos negativos o te pasas de los 100 en una\n característica, no será valido");
                    puntosMayor100 = true;
                    puntosNegativos = true;

                    while(puntosMayor100 || puntosNegativos)
                    {
                        suma = teclado.nextInt();
                        if(car_bas_enem_values[k]+ suma > 100)
                        {
                            System.out.println("Te has pasado de cien");
                            puntosMayor100 = true;
                        }else if(suma  < 0 || suma > puntos)
                        {
                            System.out.println("Has puesto puntos inválidos");
                            puntosNegativos = true;
                        }else{
                            puntosNegativos = false;
                            puntosMayor100 = false;
                        }

                    }
                    car_bas_values[k] += suma;
                    puntos -= suma; 
                    System.out.println("\u001B[31mAhora, tu nivel de "+car_bas[k]+" es de "+car_bas_enem_values[k]);
                    System.out.println("\u001B[31mY te quedan: "+ "\u001B[35m"+puntos+"\u001B[31m puntos");
                    k++;
                }
                if(puntos == 0)
                {
                    System.out.println(espaciador);
                    System.out.println("\u001B[31mVaya, parece que te has quedado sin puntos...");
                }
                for (int i = 0; i < habilidades.length; i++) 
                {    
                    if( i == 1)
                    {
                        habilidades_enem_values[i] = (int) ((int) (car_bas_enem_values[i-1] * 0.4) + (car_bas_enem_values[1] * 0.6));
                    }else
                    {
                        habilidades_enem_values[i] = (int) ((int) (car_bas_enem_values[i] * 0.4) + (car_bas_enem_values[i+1] * 0.6));
                    }

                }
                
                
                
                
            }
            //COMBATE
                
                System.out.println("\u001B[31m El enemigo ha sido configurado. Prosigamos...");
                System.out.println("HE DICHO QUE ME DES LA PIPA AHORA, MIERDA CON PATAS!");
                System.out.println("\u001B[31mQué haras?");
                System.out.println("1)Combatir\n2)Huir\n3)Insultar a su madre\n4)Entregar el arma");
                while(opcion2 > 4 || opcion2 < 1)
                {
                    System.out.println("Elige una opción");
                    opcion2 = teclado.nextInt();
                }
                combate= false;
                switch(opcion2)
                {
                    case 1: System.out.println("Deberías haberme dado la pipa...");
                            combate = true;
                            break;
                    case 2: System.out.println("\u001B[31mHas escapado esta vez, pero puede que no lo consigas la siguiente");

                            break;
                    case 3: System.out.println("Ah, si? Pues la tuya es... joder... nadie habla así de mi madre!!!");
                            System.out.println("\u001B[31mNo se cómo has hecho eso, pero el saqueador ha salido corriendo mientras lloraba. Realmente impresionante...");

                            break;
                    case 4: System.out.println("\u001B[31mLe entregas el arma al saqueador");
                            System.out.println("Muchas gracias, gilipollas, ahora no tienes con qué defenderte");
                            System.out.println("\u001B[31mEl saqueador te ha matado con tu propia arma. Tienes que ser un poco más astuto");
                            break;                    
                }
                if(!combate)
                {
                    System.out.println("\u001B[31mSi estás leyendo esto, es que has muerto, o agredido verbalmente a tu enemigo, o has salido corriendo");
                    System.out.println("\u001B[31mNo me malinterpretes, cualquiera de las dos últimas me parece aceptable, pero creo que deberías combatir igualmente");
                    System.out.println("Quieres volver? Si no lo haces, el juego se cerrará");
                    while(resucitar > 2 || resucitar < 1)
                    {
                        System.out.println("1)Volver\n2)Terminar aquí");
                        resucitar = teclado.nextInt();
                    }
                    if(resucitar==1)
                    {
                        System.out.println("\u001B[31mSabia elección");
                        combate = true;
                    }else{
                        System.out.println("\u001B[31mComo prefieras...");
                    }
                }
                if(combate)
                {
                    System.out.println(escena);
                }
                System.out.println("\u001B[31mLa batalla ha comenzado! El primero en atacar se eligirá en base a vuestra agilidad.");
                System.out.println("\u001B[31m Pulsa ENTER para continuar");
                                
                teclado.nextLine();
                if(agilidad > agilidad_e)
                {
                    System.out.println("\u001B[31mEMPIEZAS ATACANDO TÚ");
                    turno = 1;
                }else{
                    System.out.println("EMPIEZA ATACANDO EL ENEMIGO");
                    turno = 2;
                }
                while(num_vida_enem > 0 && num_vida_jug > 0 && combate)
                {
                    System.out.println(escena);
                    System.out.println("HP DE "+nombre+" : "+num_vida_jug);
                    System.out.println("HP DE SAQUEADOR  : "+num_vida_enem);
                    if(turno % 2 == 1)
                    {
                        System.out.println(menu);
                        opcion_combate = teclado.nextInt();
                        
                        switch(opcion_combate)
                        {
                            case 1:
                                
                                System.out.println("\u001B[31mCÓMO ATACARÁS?");
                                System.out.println(menu_ataque);
                                opcion_ataque = teclado.nextInt();
                                switch(opcion_ataque)
                                {
                                    case 1:
                                        
                                        ataque_rand = random.nextInt(ataque);
                                        defensa_rand = random.nextInt(defensa);
                                        System.out.println("\u001B[31mINTENTARÁS DISPARARLE");
                                        if(ataque_rand > defensa_rand)
                                        {
                                            daño = random.nextInt(dmg_disparo.length);
                                            System.out.println("\u001B[31mLOGRASTE "+"\u001B[35m"+dmg_disparo[daño]+" puntos de daño");
                                            num_vida_enem -= daño; 
                                        }else{
                                            System.out.println("\u001B[31mEl enemigo repelió tu ataque");
                                            System.out.println("NO PUEDES HACERME DAÑO");
                                        }
                                        break;
                                    case 2:
                                        ataque_rand = random.nextInt(ataque);
                                        defensa_rand = random.nextInt(defensa);
                                        System.out.println("\u001B[31mINTENTARÁS PEGARLE");
                                        if(ataque_rand > defensa_rand)
                                        {
                                            daño = random.nextInt(fuerza);
                                            System.out.println("\u001B[31mLOGRASTE "+"\u001B[35m"+daño+" puntos de daño");
                                            num_vida_enem -= (int) (daño * 0.085);
                                        }else{
                                            System.out.println("\u001B[31mEl enemigo repelió tu ataque");
                                            System.out.println("NO PUEDES HACERME DAÑO");
                                        }
                                        break;
                                        
                                    case 3:
                                        System.out.println("\u001B[31mLO INSULTARÁS");
                                        System.out.println("ME CAGO EN TU **** MADRE HIJO DE **** **** ***** ******");
                                        System.out.println("VUELVE A DECIR LO QUE HAS DICHO SI TE ATREVES **** *****");
                                        System.out.println("\u001B[31mNo parece que le haya gustado");
                                        num_vida_enem -= 1;
                                        
                                }
                                break;
                            case 2: 
                                System.out.println("INTENTAS HUIR");
                                agilidad_rand = random.nextInt(agilidad);
                                if(agilidad_rand > agilidad/2)
                                {
                                    combate = false;
                                    System.out.println("HUÍSTE CON ÉXITO");
                                }else{
                                    System.out.println("PERO NO CONSEGUISTE HUIR");
                                }
                                break;
                            case 3:
                                System.out.println("VAS A CURARTE");
                                num_vida_jug += (int)(sistemas * 0.25);
                                break;
                            
                            case 4:
                                int opcion_dial;
                                System.out.println("Qué le dirás?");
                                System.out.println(menu_dial);
                                opcion_dial = teclado.nextInt();
                                switch(opcion_dial)
                                {
                                    case 1: 
                                        if(fuerza > fuerza_e)
                                        {
                                            System.out.println("Joder, que miedo das, cabrón. Me voy a bajar el ataque");
                                            ataque_e -= 2;
                                        }else{
                                            System.out.println("Soy más grande que tú... No das mucho miedo");
                                        }
                                        break;
                                    case 2:
                                        if(carisma > 50)
                                        {
                                            System.out.println("Con lo bueno/a que estás, sería una pena matarte...");
                                            combate = false;
                                            System.out.println("\u001B[31mHas conseguido que te deje en paz... Bien hecho");
                                        }else{
                                            System.out.println("Y por que iba a hacer eso? JA JA JA");
                                        }
                                        break;
                                    case 3:
                                        if(inteligencia > inteligencia_e)
                                        {
                                            System.out.println("Joder, no lo había visto así...");
                                            System.out.println("Tienes razón; la vida no merece la pensa");
                                            System.out.println("\u001B[31mHas convencido al enemigo de que se suicide... Curioso");
                                            num_vida_enem = 0;
                                        }
                                        break;
                                    case 4:
                                        if(carisma > 70)
                                        {
                                            System.out.println("Joder, me pones cerdísimo");
                                            System.out.println("\u001B[31mPreferiría no describir lo que pasó después...");
                                            System.out.println("\u001B[31mNo sabía que una mutifruta se podía meter ahí...");
                                            System.out.println("\u001B[31mAl menos has escapado, supongo");
                                            combate = false;
                                        }
                                        break;
                                    
                                }
                                break;
                            
                                
                        }
                        
                    }else{
                        System.out.println("EL ENEMIGO INTENTARÁ ATACAR:");
                        
                        ataque_rand = random.nextInt(ataque);
                        defensa_rand = random.nextInt(defensa);
                        
                        if(ataque_rand > defensa_rand)
                        {
                            daño = ataque_rand;
                            System.out.println("\u001B[31mLOGRÓ "+daño+" PUNTOS DE DAÑO");
                            num_vida_jug -= daño; 
                        }else{
                            System.out.println("\u001B[31mREPELISTE EL ATAQUE");
                            System.out.println("MIERDA JODER");
                        }
                        
                    }
                    System.out.println("Pulsa ENTER para continuar");
                    teclado.nextLine();
                    turno++;
                }
                if(num_vida_jug <= 0)
                {
                    System.out.println("\u001B[31mLo siento, pero has muerto...");
                }else{
                    System.out.println("FELICIDADES, GANASTE");
                }
                
                
            
                                
    }
                        
                    
}
                

            
            

        


    
