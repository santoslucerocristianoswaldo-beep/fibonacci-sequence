def fibonacci(n):
    """Devuelve los primeros n números de la secuencia de Fibonacci."""
    if n <= 0:
        return []
    if n == 1:
        return [0]

    sequence = [0, 1]
    while len(sequence) < n:
        sequence.append(sequence[-1] + sequence[-2])
    return sequence


def main():
    try:
        cantidad = int(input("Ingrese la cantidad de elementos de la sucesión de Fibonacci que desea generar: "))
    except ValueError:
        print("Error: Debe ingresar un número entero válido.")
        return

    if cantidad < 0:
        print("Error: La cantidad debe ser un número mayor o igual a 0.")
        return

    resultado = fibonacci(cantidad)
    if not resultado:
        print("La secuencia es vacía para una cantidad de 0.")
    else:
        print("Secuencia de Fibonacci:")
        print(resultado)


if __name__ == "__main__":
    main()
