import org.scalatest.funsuite.AnyFunSuite

class StackOperationTest extends AnyFunSuite {

  val stack = new StackOperation()

  test("Test empty stack"){
    assert(stack.isEmpty)
  }

  test("Test pop on empty stack should return -1") {
    assert(stack.pop() == -1)
  }

  test("Test empty stack after push operation") {
    stack.push(1)
    assert(!stack.isEmpty)
  }

  test("Test top after first push") {
    stack.push(2)
    assert(stack.top == 2)
  }

  test("Test top of stack after multiple push") {
    stack.push(3)
    stack.push(5)
    assert(stack.top == 5)
  }

  test("Test top of stack after pop") {
    stack.push(4)
    stack.push(6)
    stack.push(7)
    stack.pop()
    assert(stack.top == 6)
  }

}
