def reverse_arrays(array):
    for index in range(len(array)):
        side1 = 0
        side2 = len(array[index]) - 1
        
        while side1 < side2:
            z = array[index][side1]
            array[index][side1] = array[index][side2]
            array[index][side2] = z
            
            side1 += 1
            side2 -= 1
            
    return array

array = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

result = reverse_arrays(array)
print(result)
