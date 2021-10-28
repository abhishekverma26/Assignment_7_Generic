trait Stack[A] {

  def isEmpty: Boolean
  def top: A
  def push(el: A)
  def pop(): A

}
