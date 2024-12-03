package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands
{
    String cmdName;

    public Commands(String cmd)
    {
        this.cmdName = cmd;
    }

    public String getNameCmd()
    {
    	return cmdName;
    }
}
