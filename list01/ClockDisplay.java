
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    private boolean afterMeridiem; // AM (true) ou PM(false)
    
    // Construtor que cria um novo relógio configurado
    // para 12:00 PM
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        afterMeridiem = true;
        updateDisplay();
    }

    // Construtor que cria o relógio dados hora, minutos e AM/PM
    public ClockDisplay(int hour, int minute, boolean meridiem)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        afterMeridiem = meridiem;
        
        setTime(hour, minute, meridiem);
    }

    // Atualiza o relogio a cada minuto
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) { 
            hours.increment();
        }
        updateDisplay();
    }

    //Configura o horario a ser exibido
    public void setTime(int hour, int minute, boolean meridiem)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        afterMeridiem = meridiem;
        updateDisplay();
    }

    // Retorna o horario no display no formato HH:MM AM/PM
    public String getTime()
    {
        return displayString;
    }
    
    // Atualiza a string que representa o painel do relogio
    private void updateDisplay()
    {
        String period = (!afterMeridiem) ? "PM" : "AM";
        if( hours.getValue() > 12){
            displayString = "" + (hours.getValue() - 12);
        } else if( hours.getValue() == 0 ){
            displayString = "12";
        } else {
            displayString = hours.getDisplayValue();
        }
        displayString += ":" + minutes.getDisplayValue()
                        +" "+period;
    }
}
