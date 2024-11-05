# def printValue(n = 2, *value):
#   for i in range(n):
#      for value in values: # type: ignore
#          print(value);
#      print();
		
printValue("혜정이가", "좋아하는", "랜덤 게임");

def printValue(*value, n = 2):
  for i in range(n):
      for value in values:
          print(value);
      print();
		
printValue("혜정이가", "좋아하는", "랜덤 게임", 3);
