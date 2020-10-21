
package operaciones_aritmeticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Daniel
 */
public class In_post extends javax.swing.JFrame {

        Stack pilaOperaciones = new Stack();
    Stack Final = new Stack();
    
    public In_post() {
        initComponents();
         infijo.setText("(6+2)*3/2^2-4");
         
         
    }

  public void expresion(){
      separar("(6+2)*3/2^2-4"); //infija
        
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        infijo = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        postfijo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Termino infijo");

        infijo.setEditable(false);
        infijo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        resultado.setEditable(false);
        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Termino Postfijo");

        postfijo.setEditable(false);
        postfijo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Resultado");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Realizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton2.setText("Volver al inicio");
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(postfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(infijo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(infijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(postfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Expresion Aritmetica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        expresion();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu mn=new Menu();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void separar(String operacion) {

        String simbolos = "(?=[-+*/^()])|(?<=[-+*/^()])";
    //Holaamigo
        String[] arreglo = operacion.split(simbolos);

        SeparaExpresion(arreglo);

    }

    private void SeparaExpresion(String[] arreglo) {

        List cadena = new ArrayList();

        //Recorre el arreglo que hicimos con split
        for (int i = 0; i < arreglo.length; i++) {

            //necesitamos saber si el String es un número
            if (isNumeric(arreglo[i])) {
                //insertar a la pila numérica

                cadena.add(arreglo[i]);
                
                if (i == arreglo.length - 1) {
                    while (!pilaOperaciones.empty()) {
                        cadena.add(pilaOperaciones.peek());
                        pilaOperaciones.pop();
                    }
                }

            } else {
                //insertar a la pila Operaciones

                int prioridad = prioridad(arreglo[i]);

                switch (prioridad) {

                    case 0:
                        if (!pilaOperaciones.empty()) {

                            int prioridadPila = prioridad((String) pilaOperaciones.peek());

                            if (prioridadPila == prioridad) {
                                cadena.add(pilaOperaciones.peek());

                                pilaOperaciones.pop();

                            } else if (prioridadPila > prioridad) {
                                while (!pilaOperaciones.empty()) {

                                    cadena.add(pilaOperaciones.peek());
                                    pilaOperaciones.pop();
                                }
                            }
                        }
                        pilaOperaciones.push(arreglo[i]);

                        break;
                    case 1:

                        if (!pilaOperaciones.empty()) {

                            int prioridadPila = prioridad((String) pilaOperaciones.peek());

                            if (prioridadPila == prioridad) {
                                cadena.add(pilaOperaciones.peek());
                                pilaOperaciones.pop();

                            } else if (prioridadPila < prioridad) {
                                while (!pilaOperaciones.empty()) {

                                    cadena.add(pilaOperaciones.peek());
                                    pilaOperaciones.pop();
                                }
                            }
                        }

                        pilaOperaciones.push(arreglo[i]);
                        break;

                    case 2:
                        pilaOperaciones.push(arreglo[i]);
                        break;

                    case 3:
                        while (!pilaOperaciones.empty()) {
                            cadena.add(pilaOperaciones.peek());
                            pilaOperaciones.pop();
                        }
                        break;

                    default:
                        break;
                }
            }
        }
        
      
       
        postfijo.setText(String.valueOf(cadena));
  
        combierteeInsertaenPila(cadena);
        
    }

    private void combierteeInsertaenPila(List cadena) {
        //Mis variables
        double operacion = 0;
        double valor1, valor2 = 0;

        for (int i = 0; i < cadena.size(); i++) {
            //Esta línea es para saber de qué tipo es el dato
            //System.out.println(cadena.get(i) + " es de tipo: " + ((Object) cadena.get(i)).getClass().getSimpleName());

            if (isNumeric((String) cadena.get(i))) {
                Final.push(cadena.get(i));
            } else {
                switch (OperacionDigito((String) cadena.get(i))) {
                    case 0:
                       // System.out.println("Suma");
                        valor1 = Double.parseDouble((String) Final.get(0));
                        valor2 = Double.parseDouble((String) Final.get(1));
                        operacion = valor1 + valor2;
                        Final.pop();
                        Final.pop();
                        Final.push(operacion);
                        break;
                    case 1:
                        //System.out.println("Resta");
                        valor1 = (double) Final.get(0);
                        valor2 = Double.parseDouble((String) Final.get(1));
                        operacion = valor1 - valor2;
                        Final.pop();
                        Final.pop();
                        Final.push(operacion);
                        break;
                    case 2:
                       // System.out.println("Multiplicacion");
                        valor1 = (double) Final.get(0);
                        valor2 = Double.parseDouble((String) Final.get(1));
                        operacion = valor1 * valor2;
                        Final.pop();
                        Final.pop();
                        Final.push(operacion);
                        break;
                    case 3:
                       // System.out.println("Division");
                        valor1 = (double) Final.get(0);
                        valor2 = (double) Final.get(1);
                        operacion = valor1 / valor2;
                        Final.pop();
                        Final.pop();
                        Final.push(operacion);
                        break;
                    case 4:
                       // System.out.println("potencia");
                        valor1 = Double.parseDouble((String) Final.get(1));
                        valor2 = Double.parseDouble((String) Final.get(2));
                        operacion = Math.pow(valor1, valor2);
                        Final.pop();
                        Final.pop();
                        Final.push(operacion);
                        break;
                }
            }
        }
      
       String result=String.valueOf(Final.peek());
       resultado.setText(result);
      
       
    }

    //Solamente prioridad de símboloes
    private int prioridad(String arreglo) {

        if (arreglo.equals("+") || arreglo.equals("-")) {
            return 0;
        } else if (arreglo.equals("*") || arreglo.equals("/")) {
            return 1;
        } else if (arreglo.equals("^")) {
            return 2;
        } else if (arreglo.equals(")")) {
            return 3;
        }

        return -1;
    } //Fin de la funcion prioridad

    public boolean isNumeric(String string) {

        try {
            double d = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private int OperacionDigito(String cadena) {
        if (cadena.equals("+")) {
            return 0;
        } else if (cadena.equals("-")) {
            return 1;
        } else if (cadena.equals("*")) {
            return 2;
        } else if (cadena.equals("/")) {
            return 3;
        } else {
            return 4;
        }
    
       
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField infijo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField postfijo;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables

}