package org.example

fun main() {
    println("=== Etapa 1: Funciones Básicas ===")
    val promedio1 = calcularPromedio(7.5, 8.0)
    println("El promedio es: $promedio1")

    val nota = 7.0
    val aprobado = esAprobado(nota)
    println("¿Está aprobado? $aprobado")

    println("\n=== Etapa 2: Funciones con Múltiples Parámetros ===")
    val promedioTresNotas = calcularPromedioTresNotas(7.0, 8.0, 9.0)
    println("El promedio de las tres notas es: $promedioTresNotas")

    val estado = obtenerEstadoAlumno("Juan", "Pérez", 7.5)
    println(estado)

    println("\n=== Etapa 3: Funciones con Listas ===")
    val notas = listOf(7.0, 8.0, 6.5, 9.0, 7.5)
    val promedioCurso = calcularPromedioCurso(notas)
    println("El promedio del curso es: $promedioCurso")

    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Lucía")
    val notasAlumnos = listOf(7.0, 5.0, 8.0, 6.0, 9.0)
    val aprobados = obtenerAlumnosAprobados(nombres, notasAlumnos)
    println("Alumnos aprobados: $aprobados")

    println("\n=== Etapa 4: Funciones Avanzadas ===")
    val materias = listOf("Matemática", "Lengua", "Historia")
    val notasMaterias = listOf(8.0, 7.5, 9.0)
    val boletin = generarBoletin("Juan Pérez", materias, notasMaterias)
    println(boletin)

    println("Estadísticas del curso:")
    println("Nota más alta: ${obtenerNotaMasAlta(notas)}")
    println("Nota más baja: ${obtenerNotaMasBaja(notas)}")
    println("Cantidad de aprobados: ${contarAprobados(notas)}")
}

// Etapa 1
fun calcularPromedio(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun esAprobado(nota: Double): Boolean {
    return nota >= 6.0
}

// Etapa 2
fun calcularPromedioTresNotas(nota1: Double, nota2: Double, nota3: Double): Double {
    return (nota1 + nota2 + nota3) / 3
}

fun obtenerEstadoAlumno(nombre: String, apellido: String, nota: Double): String {
    val estado = if (esAprobado(nota)) "Aprobado" else "Desaprobado"
    return "$nombre $apellido está $estado"
}

// Etapa 3
fun calcularPromedioCurso(notas: List<Double>): Double {
    return if (notas.isNotEmpty()) {
        notas.average()
    } else {
        0.0 
    }
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
    val boletin = StringBuilder()
    boletin.append("Boletín de Notas\n")
    boletin.append("Nombre: $nombre\n")
    boletin.append("Materias y Notas:\n")
    for (i in materias.indices) {
        boletin.append("${materias[i]}: ${notas[i]}\n")
    }
    boletin.append("Promedio: ${calcularPromedioCurso(notas)}\n")
    boletin.append("Estado: ${if (calcularPromedioCurso(notas) >= 6.0) "Aprobado" else "Desaprobado"}\n")
    return boletin.toString()
}

fun obtenerNotaMasAlta(notas: List<Double>): Double {
    if (notas.isNotEmpty()) {
        return notas.maxOrNull() ?: throw IllegalArgumentException("Lista de notas vacía")
    }
    throw IllegalArgumentException("Lista de notas vacía")
}

fun obtenerNotaMasBaja(notas: List<Double>): Double {
    if (notas.isNotEmpty()) {
        return notas.minOrNull() ?: throw IllegalArgumentException("Lista de notas vacía")
    }
    throw IllegalArgumentException("Lista de notas vacía")
}

fun contarAprobados(notas: List<Double>): Int {
    var contador = 0
    for (nota in notas) {
        if (esAprobado(nota)) {
            contador++
        }
    }
    return contador
}
