package f2p.woodcutting.nodes;

import interfaces.Node;

class Chop implements Node {

    @Override
    public Boolean validate() {
    
      return false;
    }

    @Override 
    public void execute() {
      return;
    }


}
