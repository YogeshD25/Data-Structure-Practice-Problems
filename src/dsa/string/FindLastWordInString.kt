package dsa.string


fun main(){
    println(lengthOfLastWord("   fly me   to   the moon  "))
}
fun lengthOfLastWord(s: String): Int {
    s.trim()
    var strArray = s.split(" ")
    return strArray[strArray.size-1].length

}