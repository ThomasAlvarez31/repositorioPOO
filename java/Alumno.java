    public class Alumno {
        // Atributos
        private int id;
        private String nombre;
        private int edad;
        private String membresia;
    
        // Constructor
        public Alumno(int id, String nombre, int edad, String membresia) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.membresia = membresia;
        }
    
        // Métodos getter y setter
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public String isMembresia() {
            return membresia;
        }
    
        public void setMembresia(String membresia) {
            this.membresia = membresia;
        }
    
        // Método toString()
        @Override
        public String toString() {
            return "Alumno{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", membresia=" + membresia +
                    '}';
        }
    }

