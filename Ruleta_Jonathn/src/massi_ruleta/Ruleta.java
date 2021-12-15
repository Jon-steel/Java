/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massi_ruleta;

import javax.swing.JOptionPane;



/**
 *
 * @author EdMa
 */
public class Ruleta 
{
    public int Automatico(String[] nombre)
    {
        String ruleta[] = {"1",
                "2",
                "3",
                "4",
                "5",
                "6",
                 "7",
                 "8"};
        String []salir = {"Continuar", "Reiniciar Juego", "Salir"};
        int con=0;       
        int aleatorio;
        int a = 0, b=0;
        String aux;
        String [] aceptar= {"Aceptar"};
        
        do // Reiniciar el juego hasta esta parte
        {
            aleatorio = (int) (Math.random() * ruleta.length);
            aux= ruleta[aleatorio];
            b=JOptionPane.showOptionDialog(null, nombre[con], "Turno "+(con+1),
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
            if(b==0)
            {
                b=JOptionPane.showOptionDialog(null, nombre[con]+" Cae en el Numero :", "Turno "+ nombre[con],
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
                if(b==0)
                {
                    b=JOptionPane.showOptionDialog(null,aux , "Turno "+nombre[con],JOptionPane.DEFAULT_OPTION, 
                            JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
                    if(b!=0)
                    {
                        a=5;//Cerrar Juego
                    }
                }
                else
                    a=5;//Cerrar Juego
            }
            else
                a=5;//Cerrar Juego
            con++;
            if(con==nombre.length && a!=5)
            {
                con=0;
                a = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Seleccionar", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,salir,salir[0]);
                if(a==1) // Reiniciar Juego
                    a=1;// Reiniciar Juego
                else
                {
                    if(a==2 || a==JOptionPane.DEFAULT_OPTION)//
                        a=5; //Cerrar Juego
                }
            }
        } while (a==0);
                
        return a;
    }

 
    public int Manual(String[] nombre)
    {
        String accion[];
        String aux, mostrar="";
        String cantidad[]= {"2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        String []salir = {"Continuar", "Reiniciar Juego", "Salir"};
        String [] aceptar= {"Aceptar"};
        int seleccion=0, con=0;
        int aleatorio;
        int a=0,b;
            
            do{
                do
                {
                    aux=  ((String)JOptionPane.showInputDialog(null, "Seleccione la cantidad de numeros que ingresará", 
                            "Seleccionar", JOptionPane.QUESTION_MESSAGE, null, cantidad, cantidad[0]));
                    if(aux!=null)//Si no cierra la ventana
                    {
                        a =Integer.parseInt(aux);
                        accion = new String[a];
                        
                        for(int i=0; i<accion.length; i++)
                        {
                            aux= JOptionPane.showInputDialog(null, "Ingrese el numero "+(i+1), "Ingresando numero", 
                                    JOptionPane.QUESTION_MESSAGE);
                            
                            do
                            {
                                if(aux!=null)
                                {
                                    if(aux.equals(""))
                                    {
                                        aux = JOptionPane.showInputDialog(null, "Error, se debe de ingresar un numero", 
                                                "Error en accion "+(i+1), JOptionPane.ERROR_MESSAGE);
                                        //Revisar
                                    }
                                    else
                                    {
                                        accion[i]=aux;
                                        mostrar += (i+1)+") "+aux+"\n";
                                    }
                                }
                                else
                                {
                                    i=accion.length;
                                    a=5;
                                }
                            } while (aux.equals(""));
                            
                        }
                        if(aux!=null) 
                        {
                            seleccion = JOptionPane.showConfirmDialog(null, "Los numeros ingresados fueron: \n"+mostrar, 
                                    "Confirmando numeros", JOptionPane.YES_NO_OPTION);
                            if(seleccion==JOptionPane.DEFAULT_OPTION)
                            {
                                aux=null;
                            }
                        }
                    }else // para cerrar la ventana
                    {
                        a=5;
                        accion = new String[1];
                    }
                } while (aux!=null && seleccion==JOptionPane.NO_OPTION );
                
                do
                {
                    aleatorio = (int) (Math.random() * accion.length) ;
                    aux = accion[aleatorio];
                    b = JOptionPane.showOptionDialog(null, nombre[con], nombre[con],JOptionPane.DEFAULT_OPTION, 
                            JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
                    if(b==0)
                    {
                        b =JOptionPane.showOptionDialog(null, nombre[con]+" Su Numero es :", nombre[con],JOptionPane.DEFAULT_OPTION, 
                                JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
                        if(b==0)
                        {
                            b=JOptionPane.showOptionDialog(null,aux , nombre[con],JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
                            if(b!=0)
                            {
                                aux=null; 
                                a=5;
                            }
                        }
                        else
                        {
                            aux=null;
                            a=5;
                        }
                    }
                    else
                    {
                        aux=null;
                        a=5;
                    }
                            con++;
                    if(con==nombre.length)
                    {
                        con=0;
                        a = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Seleccione", 
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,salir,salir[0]);
                        if(a==1) // Reiniciar Juego
                        {
                            aux=null;
                        }
                        else
                        {
                            if(a==2 || a==JOptionPane.DEFAULT_OPTION)//
                            {
                                a=5; //Cerrar Juego
                                aux=null;
                            }
                        }
                    }
                } while (aux!=null);
                 
            } while(aux!=null);
                
        return a;
    } 
}