class PhoneDirectory{

private Queue<Integer> availableSlots;
private Set<Integer> assignedSlots;

public PhoneDirectory(int maxNumbers)
{
  availableSlots = new LinkedList<>();
  assignedSlots = new HashSet<>();
  for (int i = maxNumbers ; i >=0; --i)
  {
    availableSlots.add(i);
  }
}


//O(1)
public int get()
{
  if(availableSlots.isEmpty())
  {
    return -1;
  }
  int slot = availableSlots.remove();
  assignedSlots.add(slot);
  return slot;
  
}

//O(1)
public boolean check(int number)
{
  return !assignedSlots.contains(number);
}

//O(1)
public void release(int number) {
        if(assignedSlots.contains(number)){
            assignedSlots.remove(number);
            availableSlots.add(number);
        }
    }


}
