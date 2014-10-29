val cmd = "stop"
cmd match {
	case "start" | "go" => println("starting")
	case "stop" | "quit" | "exit" => println("stopping")
	case _ => println("doing nothing")
}

trait Command
case object Start extends Command
case object Go extends Command
case object Stop extends Command
case object Whoa extends Command

def executeCommand(cmd: Command) = cmd match {
	case Start | Go => start()
	case Stop | Whoa => stop()
}

i match {
	case 0 => println("1")
	case 1 => println("2")
	case default => println("You gave me: " + default)
}