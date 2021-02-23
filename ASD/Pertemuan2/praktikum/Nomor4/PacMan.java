class PacMan{
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
        printPosition();
        
    }
    
    void moveRight(){
        x += 1;
        printPosition();
        
    }
    
    void moveUp(){
        y -= 1;
        printPosition();
    }
    
    void moveDown(){
        y += 1;
        printPosition();
    }
    
    void printPosition(){
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if((j == x) && (i == y)){ // jika jika baris j == x dan kolom i == y
                    System.out.print(" X "); // koordinat(x, y) pacman
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}