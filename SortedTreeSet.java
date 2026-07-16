public class SortedTreeSet implements SortedTreeSetInterface
{   
    private Person person; 
    private SortedTreeSet left; 
    private SortedTreeSet right; 
    
    public SortedTreeSet(Person p) { 
        person = p; 
        left = null; 
        right = null; 
    }

    //Getters 
    @Override 
    public Person getPerson() { 
        return person; 
    }  

    @Override 
    public boolean hasLeft() { 
        return left != null; 
    }

    @Override
    public boolean hasRight() { 
        return right != null; 
    } 

    @Override 
    public SortedTreeSet getRight() { 
        return right; 
    } 

    @Override
    public SortedTreeSet getLeft() { 
        return left; 
    } 

    @Override 
    public void setLeft(SortedTreeSet left) { 
        this.left = left; 
    } 

    @Override 
    public void setRight(SortedTreeSet right) { 
        this.right = right; 
    }

    //add method to add person to the tree 
    public void add(Person p) { 
        int compare = p.compareTo(person); 

        if(compare < 0) { 
            if(left == null) { 
                left = new SortedTreeSet(person);
            } 
            else { 
                left.add(p); 
            }
        } 
        else if(compare > 0) { 
            if(right == null) { 
                right = new SortedTreeSet(person); 
            } 
            else { 
                right.add(p); 
            }
        }
    } 

    //toString method for readable string 
    @Override 
    public String toString() { 
        String result = ""; 

        if(left != null) { 
            result += left.toString(); 
        } 

        result += person.toString() + "\n"; 

        if(right != null) { 
            result += right.toString(); 
        } 

        return result; 
    }
}

