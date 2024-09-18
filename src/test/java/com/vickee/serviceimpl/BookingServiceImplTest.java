package com.vickee.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vickee.model.Booking;
import com.vickee.repository.BookingRepo;

class BookingServiceImplTest {

    @Mock
    private BookingRepo repo;

    @InjectMocks
    private BookingServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddBooking() {
        Booking booking = new Booking();
        service.addBooking(booking);
        verify(repo, times(1)).save(booking);
    }

    @Test
    void testGetBookById() {
        Booking booking = new Booking();
        when(repo.findById(1L)).thenReturn(Optional.of(booking));
        
        Booking result = service.getBookById(1L);
        assertEquals(booking, result);
        
        when(repo.findById(2L)).thenReturn(Optional.empty());
        result = service.getBookById(2L);
        assertNull(result);
    }

    @Test
    void testGetBookingByRegid() {
        List<Booking> bookings = Arrays.asList(new Booking(), new Booking());
        when(repo.findByRegid("reg123")).thenReturn(bookings);
        
        List<Booking> result = service.getBookingByRegid("reg123");
        assertEquals(bookings, result);
    }

    @Test
    void testGetAllBooking() {
        List<Booking> bookings = Arrays.asList(new Booking(), new Booking());
        when(repo.findAll()).thenReturn(bookings);
        
        List<Booking> result = service.getAllBooking();
        assertEquals(bookings, result);
    }
}
