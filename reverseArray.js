function reverseArray(array){

    for(let index = 0; index < array.length; index++){

        let side1 = 0

        let side2 = array[index].length - 1

        while(side1 < side2){

            let z = array[index][side1]

            array[index][side1] = array[index][side2]

            array[index][side2] = z

            side1++
            side2--
    }
    }
    return array

}

let array = [
                [8,6],
                [2,4,5],
                [3]
            ]

console.log(reverseArray(array))
