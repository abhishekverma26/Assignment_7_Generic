class StackOperation extends Stack[Int] {

  var stack: List[Int] = List()

  def isEmpty: Boolean = {
    stack.isEmpty
  }

  def top: Int = {
    stack.head
  }

  def push(el: Int): Unit = {
    stack = el :: stack
  }

  def pop(): Int = {
    if(stack.isEmpty) return -1
    else {
      val topElement = top
      stack = stack.tail
      topElement
    }
  }

}
