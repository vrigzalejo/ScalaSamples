import java.io.File

sealed trait RandomThing

case class RandomFile(f: File) extends RandomThing
case class RandomString(s: String) extends RandomThing

class RandomNoiseMaker {
	def makeRandomNoise(t: RandomThing) = t match {
	case RandomFile(f) => playSoundFile(f)
	case RandomString(s) => speak(s)
	}
}