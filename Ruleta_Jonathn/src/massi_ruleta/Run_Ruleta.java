/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massi_ruleta;

import javax.swing.JOptionPane;

/**
 *
 * @author EddyF.
 */
public class Run_Ruleta 
{

    public static void main(String[] args) 
    {
        String [] opcion = {"Automático", "Manual", "Mas Información"};
        String [] aceptar= {"Aceptar"};
        String participantes[] = {"2","3","4","5","6","7","8","9","10"};
        String [] nombre;
        String aux="", mostrar;
        int seleccion=0, con=0, a;
        Ruleta r= new Ruleta();
        
        do
        {
            a=JOptionPane.showOptionDialog(null, "Bienvenido al Juego de la Ruleta", "Bienvenidos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,aceptar,aceptar[0]);
            if(a==0)
            {
                do
                {
                    //Cantidad de participantes
                    aux = ((String) JOptionPane.showInputDialog(null, "Selecione la cantidad de participantes", 
                            "Cantidad de Participantes", JOptionPane.QUESTION_MESSAGE, null, participantes, participantes[0]));
                    if(aux!=null)
                    {
                        con = Integer.parseInt(aux);
                        nombre = new String[con];
                        mostrar="";
                        //Ingresar nombre de los participantes
                        for(int i=0; i<nombre.length; i++)
                        {
                           aux = JOptionPane.showInputDialog(null,"Ingrese nombre del participante "+(i+1),
                                   "Participante "+(i+1),JOptionPane.QUESTION_MESSAGE);
                           if(aux!=null)
                           {
                               do
                               {
                                   if(aux.equals(""))
                                       aux = JOptionPane.showInputDialog(null,"No ingreso ningun nombre para el participante "+(i+1),
                                               "Error",JOptionPane.ERROR_MESSAGE);
                               } while(aux.equals(""));

                               nombre[i]=aux;
                               mostrar += (i+1)+") "+nombre[i]+"\n"; 
                           }
                           else
                               i=nombre.length;

                        }
                        if(aux!=null)
                        {
                            //confirmar nombre de los participantes
                            con = JOptionPane.showConfirmDialog(null, "Los nombre ingresado son: \n"+mostrar, "Confirmacion", 
                                    JOptionPane.YES_NO_OPTION);
                            if(con==JOptionPane.NO_OPTION) // Si la respuesta es no en caso contrario sale del ciclo
                                JOptionPane.showMessageDialog(null, "Vuelva a ingresar los nombres", "Selecion incorrecta", 
                                        JOptionPane.ERROR_MESSAGE);
                            else
                            {
                                if(con==JOptionPane.DEFAULT_OPTION)
                                    aux=null;
                            }
                        }
                    }
                    else
                    {
                        nombre = new String[1];
                        seleccion=5;
                    }


                } while(con==JOptionPane.NO_OPTION);

                do
                {
                    if(aux!=null)
                    {

                        seleccion = (JOptionPane.showOptionDialog(null, "Seleccione el modo de Juego", "Tipo de Juego", 
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]));

                        if(seleccion!=-1)
                        {
                            if(seleccion==0) // Automatico
                            {
                                seleccion = r.Automatico(nombre);
                                if(seleccion==5)// cerrar juego
                                    aux=null;
                            }else{
                                if(seleccion==1) //Manual
                                {
                                    seleccion = r.Manual(nombre);
                                    if(seleccion==5)// cerrar juego
                                        aux=null;
                                }
                                else
                                {
                                    if(seleccion==2) // Mas Informacion
                                    {
                                        a = JOptionPane.showOptionDialog(null, "Este juego se basa en mostrar una acción aleatoria "
                                        + "de \nuna lista de numeros para ser ejecutada por la persona en turno."
                                        + "\n\nEl juego consta de manera Auto y Manual."
                                                + "\nEl Modo Automático \nTiene una lista de 8 numeros programados."
                                                + "\nModo Manual \nSe eligen y se agregan las cantidades de numeros de modo manual."
                                                , "Mas Información",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,
                                                aceptar,aceptar[0]);
                                        if(a!=0)
                                            aux=null;
                                    }


                                }
                            }
                        }
                        else 
                            aux=null;
                    }
                } while(aux!=null && seleccion!=1);
            }
            else
                aux=null;
        } while(aux!=null);
        
    
    }
    
}
