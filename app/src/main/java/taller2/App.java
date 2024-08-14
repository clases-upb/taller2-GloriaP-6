/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            //1
            System.out.println("1. Saldo: " + Calcular_saldo(2000000, 500000, 1000000));
            //2
            System.out.println("2. " + Calcular_tip(100));
            //3
            System.out.println("3. Total Puntos: " + Obtener_puntos(3, 2, 1));
            //4
            System.out.println("4. Nota Definitiva: " + Calcular_definitiva(4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            //5
            System.out.println("5. La nota necesaria para ganar es: " + Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            //6 REVISAR
            System.out.println("6. El salario total es: " + Calcular_salario(40, 10, 5, (float) 20000));
            //7
            System.out.println("7. El Area del triángulo es: " + Calcular_area_triangulo(10, 5));
            //8
            System.out.println("8. El perímetro del cuadrado es: " + Calcular_perimetro_cuadrado(5));
            //9
            System.out.println("9. El volumen del cilindro es: " + Calcular_volumen_cilindro(5, 10));
            //10
            System.out.println("10. El área del círculo es: " + Calcular_area_circulo(5));
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int BDinero_Taquilla, int Total_Recaudos, int Total_Retiros) {
        try {
            int Saldo_Taquilla = BDinero_Taquilla + Total_Recaudos - Total_Retiros;
            if (BDinero_Taquilla == 2000000) {
                return Saldo_Taquilla;
            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float Valor_Consumo) {
        try {
            float Por10 = 0.1f;
            float Por8 = 0.08f;
            float Propina = Valor_Consumo * Por10;
            float Impuesto = Valor_Consumo * Por8;
            float Total_Pagar = Valor_Consumo + Propina + Impuesto;

            if (Valor_Consumo > 0) {
                //"valor comida: $100.0 - valor propina $10.0 - valor impoconsumo $8.0 - total a pagar $118.0"
                return "valor comida: $"+ Valor_Consumo + " - valor propina $"+ Propina + " - valor impoconsumo $"+Impuesto+ " - total a pagar $"+ Total_Pagar;
            } else {
                return "Error calculando consumo";
            }

        } catch (Exception e) {
            return "Error en la función Calcular_tip";
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int N_PGanados, int N_PPerdidos, int N_PEmpatados) {
        try {

            if (N_PPerdidos >= 0 && N_PGanados >= 0 && N_PEmpatados >= 0) {
                int PGana = 3;
                int Pperdio = 0;
                N_PGanados = N_PGanados * PGana;
                N_PPerdidos = N_PPerdidos * Pperdio;
                int Total_Puntos = N_PGanados + N_PPerdidos + N_PEmpatados;
                return Total_Puntos;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float Nota1, float Nota2, float Nota3, float Nota4, float Nota5, float Por1, float Por2, float Por3, float Por4, float Por5) {
        try {
            Nota1 = Nota1 * Por1;
            Nota2 = Nota2 * Por2;
            Nota3 = Nota3 * Por3;
            Nota4 = Nota4 * Por4;
            Nota5 = Nota5 * Por5;
            float SumaPor = Por1 + Por2 + Por3 + Por4 + Por5;
            float SumaNotas = Nota1 + Nota2 + Nota3 + Nota4 + Nota5;
            float Nota_Defenitiva = SumaNotas;
            if (Nota1 >= 0 && Nota1 <= 5 && Nota2 >= 0 && Nota2 <= 5 && Nota3 >= 0 && Nota3 <= 5 && Nota4 >= 0 && Nota4 <= 5 && Nota5 >= 0 && Nota5 <= 5) {
                if (SumaPor == 1 && Por1 >= 0 && Por1 <= 1 && Por2 >= 0 && Por2 <= 1 && Por3 >= 0 && Por3 <= 1 && Por4 >= 0 && Por4 <= 1 && Por5 >= 0 && Por5 <= 1) {
                    return Nota_Defenitiva;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float Nt1, float Nt2, float Nt3, float Nt4, float Porc1, float Porc2, float Porc3, float Porc4, float Porc5) {
        try {
            Nt1 = Nt1 * Porc1;
            Nt2 = Nt2 * Porc2;
            Nt3 = Nt3 * Porc3;
            Nt4 = Nt4 * Porc4;
            float SumaNotas = Nt1 + Nt2 + Nt3 + Nt4;
            float SumaPorc = Porc1 + Porc2 + Porc3 + Porc4 + Porc5;
            float NotaMin = 3;
            float Calculo_Ganar = (NotaMin - SumaNotas) / Porc5;
            float Nota_Ganar = Math.round(Calculo_Ganar);
            if (Nt1 >= 0 && Nt1 <= 5 && Nt2 >= 0 && Nt2 <= 5 && Nt3 >= 0 && Nt3 <= 5 && Nt4 >= 0 && Nt4 <= 5) {
                if (SumaPorc == 1 && Porc1 >= 0 && Porc1 <= 5 && Porc2 >= 0 && Porc2 <= 5 && Porc3 >= 0 && Porc3 <= 5 && Porc4 >= 0 && Porc4 <= 5 && Porc5 >= 0 && Porc5 <= 5) {
                    return Nota_Ganar;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1. REVISAR
     */
    public static float Calcular_salario(int H_Normal, int H_Dia, int H_Noches, float ValorH_Normal) {
        try {
            float Porc15 = 0.15f;
            float Porc35 = 0.35f;
            float ValorH_Normal1 = ValorH_Normal * H_Normal;
            float RecargoDiurnas = ValorH_Normal * (float)Porc15;
            float RecargoNocturnas = ValorH_Normal * (float)Porc35;
            float Salario_Total = ValorH_Normal1 + H_Dia * RecargoDiurnas + H_Noches * RecargoNocturnas;
            if (ValorH_Normal > 0) {
                return Salario_Total;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float Base, float Altura) {
        try {
            float Area = (Base * Altura) * 1 / 2;
            if (Base > 0 && Altura > 0) {
                return Area;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float Cuadrado) {
        try {
            float Perimtro_Cuadrado = Cuadrado * 4;
            if (Cuadrado > 0) {
                return Perimtro_Cuadrado;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float Radio, float Altura) {
        try {
            float Pi = (float) 3.1415927;
            float Rad_ala2 = (float) Math.pow(Radio, 2);
            float Volumen = Pi * Rad_ala2 * Altura;
            if (Radio > 0 && Altura > 0) {
                return Volumen;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }
    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float Radio) {
        try {
            float Rad_ala2 = (float)Math.pow(Radio, 2);
            float Pi = (float)3.141592;
            float Area = Pi * Rad_ala2;
            if (Radio > 0) {
                return Area;
            }
            else{
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
        
    }
}
