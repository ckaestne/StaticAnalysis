package data

/**
 * Created by IntelliJ IDEA.
 * User: Familie
 * Date: 03.10.11
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */

class ConditionEquals(a: IdentExpression, b: Expression) extends Condition{
  variable = a
  expression = b

  override def toString:String = "Eq["+variable.toString+expression.toString+"]"
}
