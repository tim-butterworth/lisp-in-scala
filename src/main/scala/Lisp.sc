//var quote = ???
//var lambda = ???
//var label = ???
//var eval = ???

var nil = Nil
var atom = (arg: Any) => arg match {
  case a :: b => false
  case _ => true
}
var cons = (item: Any, list: List[Any]) => {
  item :: list
}
var car = (list: List[Any]) => list.head
var cdr = (list: List[Any]) => list.tail
var eq = (a: Any, b: Any) => a == b
var cond = (list: List[Any]) => {
  list.head match {
    case pair: List[Any] => pair.head match {
      case expression: List[Any] => expression.head match {
        case preposition: ((Any) => Boolean) => preposition(expression.tail)
      }
    }
  }
}

var list = 2 :: 3 :: nil
var consExample = cons :: 1 :: list :: nil

atom(list)

//eval(consExample) -> 1 :: 2 :: 3 :: Nil