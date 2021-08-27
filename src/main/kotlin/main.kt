/* Aqui temos uma abstract class, ela representa uma ideia, é como um esboço pras sub classes que virão
nesse caso estamos lidando com uma residência, todas as residências são feitas de algum material de construção
 */

fun main() {

}


/*Uma abstract class é uma ideia que foge a imaterialidade de um objeto
ela possui aspectos que podem ser utilizados na construção de um objeto,
mas não podem por si só construir, por exemplo, dizer que um carro tem cor, mas,
não qual a cor.
No construtor de Dwelling passaremos como padrão o número de residentes,
esse padrão é passado através de uma var residents, essa variável será privada
e assim só poderá ser vista e modificada dentro desta classe.
 */

abstract class Dwelling(private var residents : Int) {
    /*Uma variável abstrata que serve para dizer que um material vai ser utilizado,
    na subclasse iremos determinar esses tipos de material*/
    abstract val buildingMaterial: String

    /* Essa variável indica que as residências tem uma capacidade de moradores,
    Não indica qual valor será este, essa quantidade sera definida nas subclasses
    de residência
     */
    abstract val capacity : Int


    /*Nessa função verificamos se há espaço na residência para mais moradores
    isso é feito com a função retornando um boolean ao verificar se a quantidade de
    residents é menor que a capacity.
     */
    fun hasRoom() : Boolean {
        return residents < capacity
    }
}

