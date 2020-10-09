using System;

namespace mySecondApp
{
    class Program
    {
        static void Main(string[] args)
        {
            var names = new List<string> { "<name>", "Ana", "Felipe" };
            //var names = new List<string> {"<name>", "ana", "bob"};
            foreach(var name in names){
                Console.WriteLine($"Hello {name.toUpper()}");
            }
        }
    }
}
