Thomas Kinderman Muñoz

ANÁLISIS:

El programa debería ofrecer a la empresa un registro;

La empresa podrá crear viajes, los cuales son asociados con un conductor y un bus, posteriormente los viajes se podrán agregar al arreglo de la empresa para que pueda mostrar posteriormente, los viajes buscados.

También la empresa podrá quitar buses.

Cabe destacar que en el programa ni el bus ni el conductor consideran tener como atributo un arreglo de viajes, ya que debería estar a cargo de la clase Empresa.



Clases:

Empresa:
- Atributos:
  - ArrayList<Bus> buses
  - ArrayList<Conductor> conductores
  - String rut
  - String direccion
  - ArrayList<String> redesSociales
Bus:
- Atributos:
  - String patente
  - String marca
  - String modelo
Conductor:
- Atributos:
  - String nombre
  - String apellido
  - String numeroContacto
  - String tipoLicencia
Viaje:
- Atributos:
  - String ciudadOrigen
  - String ciudadDestino
  - String horaSalida
  - String horaLlegada
  - ArrayList<String> pasajeros //nombres


Para efectos de la solución, se requiere generar un conjunto de funcionalidades en la empresa.

    Agregar buses y conductores. -> metodo agregarBus() y agregarConductor() en clase Empresa
    Asociar viajes a un bus en específico. -> metodo asociarBus() clase Empresa
    Obtener todos los buses que viajan en un determinado rango de tiempo a una ciudad de destino en específico. -> metodo agregarViaje() en conjunto con metodo auxiliar que busque en en arraylist en clase Empresa
    Descontinuar un bus de acuerdo a la patente del vehículo. -> metodo descontinuarBus() clase Empresa
