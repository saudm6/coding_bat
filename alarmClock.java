public String alarmClock(int day, boolean vacation) {
    if (day == 5 && !vacation || day == 1 && !vacation || day == 2 && !vacation || day == 3 && !vacation || day == 4 && !vacation) return "7:00";
    if (day == 5 && vacation || day == 1 && vacation || day == 2 && vacation || day == 3 && vacation || day == 4 && vacation) return "10:00";
    if (day == 0 && !vacation || day == 6 && !vacation ) return "10:00";
    return "off";
}
