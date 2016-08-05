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
var cond: List[Any] => Any = (list: List[Any]) => {
  list match {
    case Nil => Nil
    case (expression :: value :: Nil) :: tail =>
      val truthy = expression match {
        case a: Boolean => a
      }
      if (truthy) value
      else cond(list.tail)
    case (a: Any) :: Nil => a
  }
}
var lambda = ???
var eval: List[Any] => Unit = ???

//(lambda (param1 param2) (operation param1 param2))

var list = 2 :: 3 :: nil
var consExample = cons :: 1 :: list :: nil
var condExample = cond((true :: "7" :: Nil) :: Nil)
var condTwoConditionsExample = cond(
  (false :: "7" :: Nil) ::
  (false :: "6" :: Nil) ::
  "default" ::
  Nil
)

cond(Nil) == Nil
