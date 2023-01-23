package dsa.string


fun main(){
    var str = readLine()!!
    println(removeAdjacentDuplicate(str))
}
fun removeAdjacentDuplicate(str: String): String {
    var i =0
    var res = ""
    while (i < str.length -1 ){
        if(str[i] != str[i+1]){
            res += str[i]
            i++
        }

        if(i < str.length && str[i] == str[i+1]){
            while (i < str.length - 1 && str[i] == str[i+1]) {
                i++
            }
            i++
        }
    }

    if(str[str.length-2] != str[str.length-1]) res += str[str.length-1]
    return res
}