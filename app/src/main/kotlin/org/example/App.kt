
package org.example


fun main() {
    println("=== Etapa 1: Funciones Básicas ===")
    // TODO: Implementar función calcularPromedio
    val promedio1 = calcularPromedio(7.5, 8.0)
    println("El promedio es: $promedio1")

    // TODO: Implementar función esAprobado
    val nota = 7.0
    val aprobado = esAprobado(nota)
    println("¿Está aprobado? $aprobado")

    println("\n=== Etapa 2: Funciones con Múltiples Parámetros ===")
    // TODO: Implementar función calcularPromedioTresNotas
    val promedioTresNotas = calcularPromedioTresNotas(7.0, 8.0, 9.0)
    println("El promedio de las tres notas es: $promedioTresNotas")

    // TODO: Implementar función obtenerEstadoAlumno
    val estado = obtenerEstadoAlumno("Juan", "Pérez", 7.5)
    println(estado)

    println("\n=== Etapa 3: Funciones con Listas ===")
    // TODO: Implementar función calcularPromedioCurso
    val notas = listOf(7.0, 8.0, 6.5, 9.0, 7.5)
    val promedioCurso = calcularPromedioCurso(notas)
    println("El promedio del curso es: $promedioCurso")

    // TODO: Implementar función obtenerAlumnosAprobados
    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Lucía")
    val notasAlumnos = listOf(7.0, 5.0, 8.0, 6.0, 9.0)
    val aprobados = obtenerAlumnosAprobados(nombres, notasAlumnos)
    println("Alumnos aprobados: $aprobados")

    println("\n=== Etapa 4: Funciones Avanzadas ===")
    // TODO: Implementar función generarBoletin
    val materias = listOf("Matemática", "Lengua", "Historia")
    val notasMaterias = listOf(8.0, 7.5, 9.0)
    val boletin = generarBoletin("Juan Pérez", materias, notasMaterias)
    println(boletin)

    // TODO: Implementar funciones de análisis de rendimiento
    println("Estadísticas del curso:")
    println("Promedio: ${calcularPromedioCurso(notas)}")
    println("Nota más alta: ${obtenerNotaMasAlta(notas)}")
    println("Nota más baja: ${obtenerNotaMasBaja(notas)}")
    println("Cantidad de aprobados: ${contarAprobados(notas)}")
}




// TODO: Implementar las siguientes funciones:

// Etapa 1
fun calcularPromedio(nota1: Double, nota2: Double): Double {
    // Implementar aquí
    return (nota1 + nota2) / 2
}

fun esAprobado(nota: Double): Boolean {
    // Implementar aquí
    return nota >= 6.0
}

// Etapa 2
fun calcularPromedioTresNotas(nota1: Double, nota2: Double, nota3: Double): Double {
    // Implementar aquí
    return (nota1 + nota2 + nota3) / 3
}

fun obtenerEstadoAlumno(nombre: String, apellido: String, nota: Double): String {
    // Implementar aquí
    val estado = if (esAprobado(nota)) "Aprobado" else "Desaprobado"
    return "$nombre $apellido está $estado"
}

// Etapa 3
fun calcularPromedioCurso(notas: List<Double>): Double {
    // Implementar aquí
    val promedio = notas.average()
    return promedio
}

fun obtenerAlumnosAprobados(nombres: List<String>, notas: List<Double>): List<String> {
    val listaAprobados = mutableListOf<String>()
    for (i in nombres.indices) {
        if (esAprobado(notas[i])) {
            listaAprobados.add(nombres[i])
        }
    }
    return listaAprobados
}

// Etapa 4
fun generarBoletin(nombre: String, materias: List<String>, notas: List<Double>): String {
    // Implementar aquí
    return ""
}

fun obtenerNotaMasAlta(notas: List<Double>): Double {
    // Implementar aquí
    return 0.0
}

fun obtenerNotaMasBaja(notas: List<Double>): Double {
    // Implementar aquí
    return 0.0
}

fun contarAprobados(notas: List<Double>): Int {
    // Implementar aquí
    return 0
}
