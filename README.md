# usability-analyzer
Model-based architecture for the usability analysis and correction of GUIs.


La arquitectura está dividida en dos carpetas:

- usability_analysis_correction: es el proyecto principal y contiene toda la arquitectura MDE que realiza el análisis y la corrección de la usabilidad.
Contiene dos ficheros Ant para lanzar los procesos de análisis y corrección. La corrección puede ejecutarse sobre un modelo GUI diseñado como prueba, llamado gui_backup.xmi. El análisis se ha adaptado para que funcione sobre Android, partiendo de un modelo android_original.xmi e introduciendo la transformación Android2GUI. Para la ejecución de cualquiera de las dos tareas desde Eclipse, hay que seguir las indicaciones que se dan al principio de ambos ficheros, consideraciones que no son propias de nuestro sistema sino que deben seguirse para la ejecución de cualquier fichero Ant que defina tareas relativas a Epsilon.
El proyecto también contiene el paquete android.launch con las clases Java necesarias para lanzar la cadena de transformaciones desde código Java.
No se incluyen los proyectos EMFText pues estos pueden generarse fácilmente a partir de la gramática de reglas de usabilidad.

- android: contiene los proyectos api2mol básicos y el proyecto api2mol correspondiente a Android, así como un proyecto Android de prueba creado en AndroidStudio.
El proyecto api2mol.android contiene las clases para lanzar tanto el proceso bootstrap para descubrir el metamodelo como la clase para lanzar el proceso de inyección. Este proyecto junto con los básicos de api2mol son los que se exportan en un jar para ser importados desde el proyecto Android. Los ficheros androidUA-ejecucion.txt y androidUA-implementacion.txt contienen más detalles sobre la integración de Android con la herramienta de evaluación de la usabilidad.
También está en esta carpeta el fichero GUI-Android_mapping.docx con información sobre la forma en que he realizado el mapeo entre los conceptos del API de Android y del metamodelo GUI.
